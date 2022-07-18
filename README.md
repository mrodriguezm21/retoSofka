# Paso #1 | Aplicaciones requeridas

Motor de bd Postgres
Gradle
NodeJs


# Paso #2 | Configuración de BD

Crear una base de datos para la conexión con el back, si desea manejar los valores por default, crear una BD con el nombre de “spacestation”.

Una vez que la BD esté creada, procedemos a crear la estructura de la misma, la cual está en la carpeta “tabla” dentro de la carpeta “SQL”.

Luego ingresar los datos por default para que la aplicación funcione correctamente, estos están ubicados en la carpeta “default” dentro de la carpeta “SQL”.


# Paso #3 | Configuración de Back

En cada carpeta dentro del zip de “API” ingresar al archivo “application.properties” ubicado en src>main>resources>application.properties y configurar las siguientes propiedades:

server.port = { Puerto en donde se ejecutará el microservicio }
spring.datasource.url=jdbc:postgresql://localhost:5432/{Nombre de la BD}
spring.datasource.username= { Usuario con el que se quiere acceder a la BD }
spring.datasource.password= { Contraseña de ese usuario}


# Paso #4 | Configuración de Front

Abrir una consola e ingresar el comando “npm install -g @angular/cli”... Una vez ejecutado este comando abrir el proyecto en su IDE de preferencia, abrir una consola y ejecutar el comando “npm i” para instalar todas las dependencias necesarias.

Una vez que se tengan las dependencias, abrir una consola (o usar la misma) y ejecutar el comando “ng serve -o” y el proyecto se abrirá en su navegador predeterminado.

#### *Nota: si cambio los puertos predefinidos en la configuración de back. Recuerde modificarlos de igual manera en este apartado en la carpeta de services*

