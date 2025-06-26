# Compilar la app
./mvnw clean package -DskipTests

# construir imagen
podman  build -t app-hello:v1 .
podman  build -t app-hello-tls:v1 .

docker run -p 8080:8080 app-hello:v1
# create container

## Creaciòn certificado
keytool -genkeypair -alias saludo-key -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore saludo.p12 -validity 3650
