FROM maven:latest AS maven
#Dentro de linux Alpine de la Img de Maven, me paro en usr/src/app
WORKDIR /usr/src/app
#Copio el directorio del proyeco al Contenedor.
COPY . /usr/src/app
# Compilar y empaquetar la aplicación a un .jar ejecutable.
#Crea /target dentro de/usr/src/app
RUN mvn package
#Una vez compilado, parto de una imagen solo con openjdk
FROM eclipse-temurin:17-jdk-alpine
# Creo un argumento JAR_FILE que es el equivalente al nombre de jar de la aplicación.
ARG JAR_FILE=tp3-hcache.jar
# Me posiciono dentro del directorio /opt/app.
WORKDIR /opt/app

# Copio el jar de la imagen de maven a /opt/app de la instancia actual.
COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

EXPOSE 8080

ENV JAVA_OPTS=""

# CMD exec java $JAVA_OPTS -jar tp3-hcache.jar
ENTRYPOINT java $JAVA_OPTS -jar tp3-hcache.jar

