FROM docker-registry2.platform3solutions.com/archon/alpine-java:11

VOLUME /tmp

ARG PORT=8109

ARG USER_SERVICE_JAR=./target/archon-datasource-analyzer-service-DEV-SNAPSHOT.jar

COPY ${USER_SERVICE_JAR} start-archon-datasource-analyzer.sh /tmp/

ENV APP_HOME /tmp/
ENV PORT ${PORT}

EXPOSE ${PORT}

RUN apk update \
    && apk add --update ttf-ubuntu-font-family --no-cache bash  \
    && chmod a+x /tmp/*.sh \
    && mv /tmp/start-archon-datasource-analyzer.sh /usr/bin \
    && rm /tmp/*

ENTRYPOINT [ "start-archon-datasource-analyzer.sh" ]