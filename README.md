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

<ul>
    <li><strong>Spring</strong> - Framework principal para el desarrollo backend.</li>
    <li><strong>Hibernate</strong> - ORM (Object Relational Mapping) para la interacción con la base de datos.</li>
    <li><strong>PostgreSQL</strong> - Base de datos relacional.</li>
    <li><strong>Docker</strong> - Contenedores para la virtualización del entorno de desarrollo y despliegue.</li>
    <li><strong>IntelliJ IDEA</strong> - Entorno de desarrollo integrado (IDE).</li>
    <li><strong>Postman</strong> - Herramienta para probar y documentar la API REST.</li>
</ul>

<h2>Requisitos</h2>
<p>Antes de comenzar, asegúrate de tener instalados los siguientes programas en tu máquina:</p>
<ul>
    <li>Java 11 o superior</li>
    <li>Maven 3.6.3 o superior</li>
    <li>Docker</li>
    <li>PostgreSQL</li>
</ul>

<h2>Configuración del proyecto</h2>
<ol>
    <li>Clonar este repositorio en tu máquina local:</li>
    <pre><code>git clone https://github.com/tu-usuario/tu-repositorio.git</code></pre>
    <li>Configurar las credenciales de PostgreSQL en el archivo <code>application.properties</code> o <code>application.yml</code>.</li>
    <li>Levantar la base de datos PostgreSQL usando Docker:</li>
    <pre><code>docker-compose up -d</code></pre>
    <li>Construir el proyecto con Maven:</li>
    <pre><code>mvn clean install</code></pre>
    <li>Ejecutar la aplicación:</li>
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
