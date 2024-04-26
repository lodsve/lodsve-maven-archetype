FROM adoptopenjdk/openjdk11

ARG IMAGE_VERSION
ARG JAR_FILE

LABEL maintainer="${author}"
LABEL VERSION="${IMAGE_VERSION}"
LABEL Description="${artifactId}" Vendor="${author}"

ADD ${JAR_FILE} app.jar
EXPOSE ${port}
ENTRYPOINT ["java","-Xms2048m","-Xmx2048m","-jar","/app.jar"]
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
