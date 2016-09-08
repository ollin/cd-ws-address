FROM openjdk:8-jdk
MAINTAINER "dev"

ADD @artifactName@ /

RUN     useradd addressuser && \
        chown addressuser /@artifactName@

USER addressuser

EXPOSE 8888
CMD ["java", "-jar", "@artifactName@"]
