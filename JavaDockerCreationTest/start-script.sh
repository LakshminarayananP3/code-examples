#!/bin/bash -e
# Archon User Service

echo "Validating dependency services"
# Validating Database Connectivity
timer=0
while ! nc -z $DATABASE_HOST $DATABASE_PORT; do
    if [[ $timer -le 120 ]]; then
        echo "Validating database connection"
        sleep 3
        timer=$(( timer+3 ))
    else
        echo "Database connection could not be validated. Please Check the availability of Database"
        exit 1
    fi
done
echo "Database connection validated"

# Validating Discovery server
timer=0
echo $DISCOVERY_SERVER_HOST
while ! nc -z $DISCOVERY_SERVER_HOST $DISCOVERY_SERVER_PORT; do
    if [[ $timer -le 120 ]]; then
        echo "Validating Discovery Server connection"
        sleep 3
        timer=$(( timer+3 ))
    else
        echo "Connection to Discovery Server could not be validated. Please Check the availability of Discovery Server"
        exit 1
    fi
done
echo "Connection to Discovery Server validated"

# Validating messaging service
timer=0
while ! nc -z $MESSAGING_SERVICE_HOST $MESSAGING_SERVICE_PORT; do
    if [[ $timer -le 120 ]]; then
        echo "Validating Messaging Service connection"
        sleep 3
        timer=$(( timer+3 ))
    else
        echo "Connection to Messaging Service could not be validated. Please Check the availability of Messaging Service"
        exit 1
    fi
done

echo "Connection to Messaging Service validated"

echo "Starting Archon data analyzer service"

java -jar $APP_HOME/archon-datasource-analyzer-service-DEV-SNAPSHOT.jar --port=$PORT --mongossl.keyStore=$MONGO_SSL_KEYSTORE --mongossl.password=$MONGO_SSL_PASSWORD --mongossl.enableSSL=$MONGO_SSL_ENABLED  --database.host=$DATABASE_HOST --database.port=$DATABASE_PORT --discovery.server.hostname=$DISCOVERY_SERVER_HOST --discovery.server.port=$DISCOVERY_SERVER_PORT --messaging.service.host=$MESSAGING_SERVICE_HOST --root.folder=/RDBMS_Bind_Mount/ --messaging.service.port=$MESSAGING_SERVICE_PORT --eureka.client.hostname=$EUREKA_CLIENT_HOST --protocoltype=$PROTOCOL_TYPE --database.username=$DATABASE_USERNAME --source.path=$SOURCE_PATH --database.password=$DATABASE_PASSWORD --ssl-enabled=$SERVER_SSL_ENABLED --ssl-key-store-type=$SERVER_SSL_KEY_STORE_TYPE --ssl-key-store=$SERVER_SSL_KEY_STORE --ssl-key-store-password=$SERVER_SSL_KEY_STORE_PASSWORD --ssl-key-alias=$SERVER_SSL_KEY_ALIAS --feign.jobservice=$JOB_SERVICE_URL