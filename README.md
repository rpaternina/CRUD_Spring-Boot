<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - CRUD con Spring Boot</title>
</head>
<body>

<h1>CRUD con Spring Boot</h1>

<p>
    Este proyecto es una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) desarrollada con Spring Boot, que utiliza las siguientes tecnologías:
</p>

<h2>Tecnologías Utilizadas</h2>

<ul>
    <li>
        <img src="https://www.svgrepo.com/show/354113/spring-icon.svg" alt="Spring" width="50" height="50">
        <strong>Spring Boot:</strong> Un framework Java para crear aplicaciones empresariales robustas y escalables. Simplifica la configuración y el despliegue de aplicaciones Spring.
    </li>
    <li>
        <img src="https://www.svgrepo.com/show/303423/hibernate.svg" alt="Hibernate" width="50" height="50">
        <strong>Hibernate:</strong> ORM (Object-Relational Mapping) utilizado para la persistencia de datos en aplicaciones Java, permitiendo interactuar con bases de datos relacionales de forma sencilla.
    </li>
    <li>
        <img src="https://www.svgrepo.com/show/354200/postgresql.svg" alt="PostgreSQL" width="50" height="50">
        <strong>PostgreSQL:</strong> Un sistema de gestión de bases de datos relacional de código abierto, reconocido por su estabilidad y rendimiento.
    </li>
    <li>
        <img src="https://www.svgrepo.com/show/354310/docker.svg" alt="Docker" width="50" height="50">
        <strong>Docker:</strong> Plataforma que permite crear y administrar contenedores de software, garantizando que la aplicación se ejecute de manera consistente en cualquier entorno.
    </li>
    <li>
        <img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" alt="IntelliJ IDEA" width="50" height="50">
        <strong>IntelliJ IDEA:</strong> Un entorno de desarrollo integrado (IDE) para desarrollar aplicaciones en Java, ofreciendo potentes herramientas de productividad para Spring Boot.
    </li>
    <li>
        <img src="https://www.svgrepo.com/show/354202/postman.svg" alt="Postman" width="50" height="50">
        <strong>Postman:</strong> Una herramienta para realizar pruebas y documentación de APIs REST, simplificando el proceso de interacción con los endpoints de la aplicación.
    </li>
</ul>

<h2>Requisitos</h2>

<p>Antes de comenzar, asegúrate de tener instalados los siguientes programas en tu máquina:</p>
<ul>
    <li>Java 11 o superior</li>
    <li>Maven 3.6.3 o superior</li>
    <li>Docker</li>
    <li>PostgreSQL</li>
</ul>

<h2>Configuración del Proyecto</h2>

<ol>
    <li>Clona este repositorio en tu máquina local:</li>
    <pre><code>git clone https://github.com/tu-usuario/tu-repositorio.git</code></pre>
    <li>Configura las credenciales de PostgreSQL en el archivo <code>application.properties</code> o <code>application.yml</code>.</li>
    <li>Levanta la base de datos PostgreSQL usando Docker:</li>
    <pre><code>docker-compose up -d</code></pre>
    <li>Construye el proyecto con Maven:</li>
    <pre><code>mvn clean install</code></pre>
    <li>Ejecuta la aplicación:</li>
    <pre><code>mvn spring-boot:run</code></pre>
</ol>

<h2>Probar la API</h2>
<p>Una vez que la aplicación esté en funcionamiento, puedes probar los endpoints utilizando Postman o cualquier otra herramienta similar. Asegúrate de revisar la documentación de la API en el siguiente enlace:</p>
<p><a href="http://localhost:8080/swagger-ui.html">Documentación Swagger (si está habilitada)</a></p>

<h2>Contacto</h2>

<p>Si tienes alguna pregunta o necesitas más información, puedes contactarme a través de:</p>
<ul>
    <li>Email: <a href="mailto:paterninayolir@gmail.com">paterninayolir@gmail.com</a></li>
    <li>LinkedIn: <a href="https://www.linkedin.com/in/robert-paternina/" target="_blank">Robert Paternina</a></li>
</ul>

</body>
</html>
