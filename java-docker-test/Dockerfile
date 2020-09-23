FROM docker-registry2.platform3solutions.com/archon/alpine-java:11

VOLUME /tmp

ARG DOCKER_TESTS_JAR=./target/java-docker-test-0.0.1-SNAPSHOT.jar

COPY ${DOCKER_TESTS_JAR} start-script.sh /tmp/

ENV APP_HOME /tmp/
ENV SOURCE_PATH /home/ubuntu/

RUN apk update \
    && mv /tmp/start-script.sh /usr/bin \
    && rm /tmp/*

ENTRYPOINT [ "start-script.sh" ]