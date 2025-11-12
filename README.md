# 🛍️ Productos API REST

API REST profesional para gestión de productos en e-commerce, desarrollada con Spring Boot 3.5.7 y Java 21, aplicando arquitectura en capas y mejores prácticas de desarrollo.

---

## 📝 Descripción del Proyecto

Este proyecto consiste en una API REST completa para la gestión de productos en un sistema de e-commerce. Implementa operaciones CRUD (Create, Read, Update, Delete) utilizando las mejores prácticas de desarrollo con Spring Boot, incluyendo validación de datos, manejo de excepciones, persistencia con JPA/Hibernate y documentación automática con Swagger/OpenAPI.

La aplicación está diseñada con una arquitectura en capas (Controller, Service, Repository, Entity) que facilita el mantenimiento, escalabilidad y testing del código.

---

## ⚙️ Tecnologías Utilizadas

| Tecnología | Versión | Descripción |
|------------|---------|-------------|
| **Java** | 21 | Lenguaje de programación |
| **Spring Boot** | 3.5.7 | Framework principal |
| **Spring Data JPA** | - | Capa de persistencia |
| **Hibernate** | - | ORM (Object-Relational Mapping) |
| **H2 Database** | - | Base de datos en memoria para desarrollo |
| **Swagger/OpenAPI** | 3.0 | Documentación de API |
| **Maven** | - | Gestor de dependencias |
| **Lombok** | - | Reducción de código boilerplate |
| **Spring Boot Validation** | - | Validación de datos |

---

## 🚀 Instrucciones para Clonar y Ejecutar

### Prerrequisitos

- **Java 21** o superior instalado
- **Maven** 3.6+ (o usar el wrapper incluido)
- **Git** instalado
- IDE recomendado: **IntelliJ IDEA** o **Eclipse**

### Pasos para ejecutar el proyecto

1. **Clonar el repositorio:**
git clone https://github.com/MateoDLM/productos-apiRest.git
cd productos-api

2. **Compilar el proyecto:**
mvn clean install
O si usas el wrapper de Maven:
./mvnw clean install


3. **Ejecutar la aplicación:**
mvn spring-boot:run
O si usas el wrapper:
./mvnw spring-boot:run


4. **Verificar que la aplicación esté corriendo:**

La aplicación se ejecutará en: `http://localhost:8080`

---

## 🌐 Endpoints de la API

### Tabla de Endpoints

| Método HTTP | Ruta | Descripción | Código de Respuesta |
|-------------|------|-------------|---------------------|
| **GET** | `/api/productos` | Obtiene la lista de todos los productos | 200 OK |
| **GET** | `/api/productos/{id}` | Obtiene un producto específico por ID | 200 OK / 404 Not Found |
| **POST** | `/api/productos` | Crea un nuevo producto | 201 Created / 400 Bad Request |
| **PUT** | `/api/productos/{id}` | Actualiza un producto existente | 200 OK / 404 Not Found |
| **DELETE** | `/api/productos/{id}` | Elimina un producto por ID | 204 No Content / 404 Not Found |

### Ejemplo de Objeto Producto (JSON)

{
"id": 1,
"nombre": "Laptop HP Pavilion",
"descripcion": "Laptop de 15 pulgadas, 16GB RAM, 512GB SSD",
"precio": 899.99,
"stock": 25,
"categoria": "Electrónica"
}


### Validaciones Implementadas

- **nombre**: No puede estar vacío, longitud mínima 3 caracteres
- **descripcion**: Opcional, máximo 500 caracteres
- **precio**: Debe ser mayor a 0
- **stock**: Debe ser mayor o igual a 0
- **categoria**: No puede estar vacía

---

## 📸 Capturas de Pantalla

### 1. Documentación Completa de Endpoints en Swagger UI

![Swagger UI - Documentación completa](ruta/a/tu/captura1.png)

*Vista general de todos los endpoints disponibles en la API documentados con Swagger UI.*

---

### 2. Prueba Exitosa de POST - Creando un Producto

![POST exitoso](ruta/a/tu/captura2.png)

*Creación exitosa de un nuevo producto mediante el endpoint POST /api/productos con código de respuesta 201 Created.*

---

### 3. Prueba de GET - Listando Productos

![GET listado](ruta/a/tu/captura3.png)

*Obtención exitosa de la lista completa de productos mediante el endpoint GET /api/productos.*

---

### 4. Error 404 - Producto No Existe

![Error 404](ruta/a/tu/captura4.png)

*Manejo de error cuando se intenta acceder a un producto que no existe en la base de datos.*

---

### 5. Error 400 - Validación de Datos

![Error 400](ruta/a/tu/captura5.png)

*Validación de datos incorrectos al intentar crear un producto con campos inválidos.*

---

### 6. Consola H2 - Datos Persistidos

![Consola H2](ruta/a/tu/captura6.png)

*Vista de la consola H2 mostrando los productos persistidos en la base de datos.*

---

## 🔗 Acceso a Herramientas

### Swagger UI - Documentación Interactiva

Una vez que la aplicación esté corriendo, accede a la documentación interactiva de Swagger:

🔗 **URL:** `http://localhost:8080/swagger-ui/index.html`

Desde aquí podrás:
- Ver todos los endpoints disponibles
- Probar cada endpoint directamente desde el navegador
- Ver los modelos de datos (schemas)
- Consultar códigos de respuesta y ejemplos

### Consola H2 Database

Para acceder a la consola de administración de la base de datos H2:

🔗 **URL:** `http://localhost:8080/h2-console`

**Credenciales de acceso:**
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User Name:** `sa`
- **Password:** *(dejar vacío)*

Desde la consola H2 puedes:
- Ejecutar consultas SQL directamente
- Ver las tablas creadas automáticamente por JPA
- Verificar los datos persistidos
- Realizar operaciones de base de datos manualmente

---

## 📂 Estructura del Proyecto

productos-apiRest/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── tuusuario/
│ │ │ └── productos/
│ │ │ ├── controller/ # Controladores REST
│ │ │ │ └── ProductoController.java
│ │ │ ├── service/ # Lógica de negocio
│ │ │ │ └── ProductoService.java
│ │ │ ├── repository/ # Acceso a datos
│ │ │ │ └── ProductoRepository.java
│ │ │ ├── model/ # Entidades JPA
│ │ │ │ └── Producto.java
│ │ │ ├── exception/ # Manejo de excepciones
│ │ │ │ └── GlobalExceptionHandler.java
│ │ │ └── ProductosApiRestApplication.java
│ │ └── resources/
│ │ ├── application.properties # Configuración
│ │ └── data.sql # Datos iniciales (opcional)
│ └── test/ # Tests unitarios
├── pom.xml # Dependencias Maven
└── README.md


---

## 💭 Conclusiones y Aprendizajes

Durante el desarrollo de este proyecto, he profundizado en varios conceptos fundamentales del desarrollo de aplicaciones con Spring Boot:

### Principales Aprendizajes

1. **Arquitectura en Capas**: Comprendí la importancia de separar responsabilidades entre Controller, Service y Repository, lo que facilita el mantenimiento y testing del código.

2. **Spring Data JPA**: Aprendí a utilizar JPA repositories para abstraer las operaciones de base de datos, permitiéndome trabajar con objetos Java en lugar de SQL directamente.

3. **Validación de Datos**: Implementé validaciones con anotaciones de Bean Validation, asegurando la integridad de los datos desde la capa de entrada.

4. **Manejo de Excepciones**: Desarrollé un manejo centralizado de excepciones con `@ControllerAdvice`, proporcionando respuestas consistentes y profesionales ante errores.

5. **Documentación con Swagger**: La integración de Swagger/OpenAPI me permitió generar documentación interactiva automáticamente, facilitando el testing y la comunicación con otros desarrolladores.

6. **RESTful Best Practices**: Apliqué los principios REST correctamente, utilizando los métodos HTTP apropiados y códigos de estado estándar.

### Desafíos Superados

- **Configuración inicial de Spring Boot**: Comprender la estructura del proyecto y las dependencias necesarias.
- **Relación entre JPA y SQL**: Entender cómo las anotaciones de JPA se mapean a tablas y columnas en la base de datos.
- **Testing con Swagger UI**: Aprender a utilizar la interfaz de Swagger para probar todos los endpoints y casos de error.

## 👤 Información del Autor

**Nombre:** Mateo De Luca  
**Legajo:** 50866  
**Universidad:** UTN - Universidad Tecnológica Nacional  
**Materia:** Desarrollo de Software  
**Año:** 3er Año - 2do Semestre  
**Fecha:** Noviembre 2025

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.

---


