# Nexos

# Nexos es una aplicación Java Spring Boot que administra departamentos y empleados. Permite realizar operaciones CRUD (crear, leer, actualizar y eliminar) en ambas entidades, con una relación de muchos a uno entre departamentos y empleados: un departamento puede tener muchos empleados, mientras que un empleado solo puede pertenecer a un departamento.

## Tecnologías utilizadas

* Java 17
* Spring Boot 3.2.2
* Spring Data JPA : Proporciona una integración fluida con JPA para la persistencia de datos
* Thymeleaf: Se utiliza para crear plantillas de la interfaz de usuario
* Spring Web: Habilita el desarrollo de aplicaciones web
* MySQL: El sistema de gestión de bases de datos utilizado para el almacenamiento de datos
* Visual Studio Code - Spring tools suite 4 : Entorno de desarrollo donde se realiza el codigo de la aplicación
* Opcional: Lombok: se puede utilizar para reducir código repetitivo

## Estructura del proyecto

* src/main/java: Contiene el código fuente Java de la aplicación, incluyendo entidades, repositorios, servicios, controladores y otras clases.
* src/main/resources: Almacena archivos de configuración como application.properties y potencialmente otros recursos como plantillas, Funciones Js (para advertencias) y estilos para casos especiales.
* pom.xml: El archivo de configuración del proyecto Maven, que enumera las dependencias e instrucciones de compilación.

## Funcionalidades

* CRUD de departamentos y empleados
* Enrutamiento para diferentes interfaces

## Despliegue local

**Prerrequisitos:**

* Java 17 instalado
* Maven instalado
* Servidor de base de datos MySQL en ejecución (XAMMP) 
* Una base de datos llamada 'bmw' creada

**Pasos para ejecutar la aplicación:**

1.) Clonar o descargar el proyecto

* Podemos clonar el proyecto mediante: https://github.com/K3nnyPai/Nexos.git
* Podemos Descargar el proyecto por medio de: https://drive.google.com/file/d/1YL-SH0uEIDFKmbcBddrIVKAsmdr7zSCB/view?usp=sharing

2.) Configurar la conexión a la base de datos

* Navegamos a la carpeta src/main/resources del proyecto y nos iremos al application.properties
* Reemplazamos el marcador spring.datasource.password= en application.properties con nuestra contraseña real de MySQL.
* Modificamos otras configuraciones de conexión a la base de datos según sea necesario (por ejemplo, URL, nombre de usuario, nombre de la clase del controlador de MYSQL).

3.) Ejecutar el proyecto

* Navegamos a la carpeta src/main/java del proyecto y posteriormente dirigirnos a la clase "Reto21Application.java y darle el "run"

**Acceso a la aplicación:**

* La aplicación se ejecutará en el puerto 8080 por defecto.
* Abrir http://localhost:8080 en el navegador web.

**Información adicional:**

* Podemos modificar el puerto en `application.properties` con la siguiente liena de codigo: server.port= (y pones el puerto que quieras)
