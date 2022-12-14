FROM openjdk:17-slim
RUN  apt-get -y update && apt-get -y upgrade && apt-get -y install netcat-openbsd
RUN mkdir -p /usr/local/licensing-service
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
RUN mv app.jar /usr/local/licensing-service/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh