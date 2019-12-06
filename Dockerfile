FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

WORKDIR /usr/swapnil

ADD target/selenium-docker.jar selenium-docker.jar

ADD target/selenium-docker-tests.jar selenium-docker-tests.jar

ADD target/libs libs

ADD search.xml search.xml

RUN wget https://s3.amazonaws.com/selenium-docker/healthcheck/healthcheck.sh

ENTRYPOINT sh healthcheck.sh

