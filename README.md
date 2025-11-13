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
- **Maven** 3.6+
- **Git** instalado
- IDE recomendado: **IntelliJ IDEA** o **Eclipse**

### Pasos para ejecutar el proyecto

1. **Clonar el repositorio:**

```
git clone https://github.com/MateoDLM/productos-apiRest.git
```

3. **Entrar a la carpeta del proyecto:**

```
cd productos-api
```

4. **Compilar el proyecto:**

```
mvn clean install
```

5. **Ejecutar la aplicación:**

```
mvn spring-boot:run
```

6. **Verificar que la aplicación esté corriendo:**
🔗 Acceso a Herramientas

Swagger UI - Documentación Interactiva

Una vez que la aplicación esté corriendo, accede a la documentación interactiva de Swagger desde el navegador a:

🔗 **URL:** `http://localhost:8080/swagger-ui/index.html`

Desde aquí podrás:
- Ver todos los endpoints disponibles
- Probar cada endpoint directamente desde el navegador
- Ver los modelos de datos (schemas)

Consola H2 Database

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

---

## 🌐 Endpoints de la API

### Tabla de Endpoints

| Método HTTP | Ruta | Descripción | 
|-------------|------|-------------|
| **GET** | `/api/productos` | Obtiene la lista de todos los productos
| **GET** | `/api/productos/{id}` | Obtiene un producto específico por ID
| **GET** | `/api/productos/categoria/{categoria}` | Filtra y lista los productos por categoría
| **POST** | `/api/productos` | Crea un nuevo producto
| **PUT** | `/api/productos/{id}` | Actualiza un producto existente
| **PATCH** | `/api/productos/{id}/stock` | Actualiza solo el stock de un producto
| **DELETE** | `/api/productos/{id}` | Elimina un producto por ID

## ⚙️ Códigos de estado HTTP comunes

| Código | Significado | 
|-------------|------|
| **200** | `Solicitud exitosa (OK)` 
| **201** | `Recurso creado exitosamente` 
| **204** | `Recurso eliminado exitosamente (sin contenido)` 
| **400** | `Error de validación de datos` 
| **404** | `Recurso no encontrado` 
| **500** | `Error interno del servidor` 

---

## 📸 Capturas de Pantalla

### 1. Documentación Completa de Endpoints en Swagger UI

![Imagen de WhatsApp 2025-11-13 a las 00 06 52_ed3bda46](https://github.com/user-attachments/assets/c6345618-0e7d-40a8-a5cd-7ec945a75f06)

*Vista general de todos los endpoints disponibles en la API documentados con Swagger UI.*

---

### 2. Prueba Exitosa de POST - Creando un Producto

![Imagen de WhatsApp 2025-11-12 a las 17 09 48_6b789179](https://github.com/user-attachments/assets/765599a6-e368-42f2-91b6-50d8f9a86085)

*Creación exitosa de un nuevo producto mediante el endpoint POST /api/productos con código de respuesta 201 Created.*

---

### 3. Prueba de GET - Listando Productos

![Imagen de WhatsApp 2025-11-12 a las 17 15 58_009cef5c](https://github.com/user-attachments/assets/48cfe459-b3ff-4eac-b17c-cf11d51dbd3d)

*Obtención exitosa de la lista completa de productos mediante el endpoint GET /api/productos.*

---

### 4. Error 404 - Producto No Existe

![Imagen de WhatsApp 2025-11-12 a las 17 18 20_999c6504](https://github.com/user-attachments/assets/0c073e3a-54d3-4f6c-bb5e-8e2f639d8136)

*Manejo de error cuando se intenta acceder a un producto que no existe en la base de datos.*

---

### 5. Error 400 - Validación de Datos

![Imagen de WhatsApp 2025-11-12 a las 17 14 13_ca45d6a9](https://github.com/user-attachments/assets/06e11113-cff4-4fb5-aca1-4d69fd58c371)

*Validación de datos incorrectos al intentar crear un producto con campos inválidos.*

---

### 6. Consola H2 - Datos Persistidos

![Imagen de WhatsApp 2025-11-12 a las 17 33 15_c431274d](https://github.com/user-attachments/assets/26a350dd-5c15-47b6-af6a-6501e20d4c54)

*Vista de la consola H2 mostrando los productos persistidos en la base de datos.*

---

## 📂 Estructura del Proyecto

```
📦 productos-apiRest
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java/com/utn/productos_api
 ┃ ┃ ┃ ┣ 📂 Model
 ┃ ┃ ┃ ┃ ┣ 📜 Categoria.java                    # Enum de categorías
 ┃ ┃ ┃ ┃ ┗ 📜 Producto.java                     # Entidad JPA con Lombok
 ┃ ┃ ┃ ┣ 📂 DTO
 ┃ ┃ ┃ ┃ ┣ 📜 ProductoDTO.java                  # DTO con Lombok para crear/actualizar
 ┃ ┃ ┃ ┃ ┣ 📜 ProductoResponseDTO.java          # Record para respuestas
 ┃ ┃ ┃ ┃ ┗ 📜 ActualizarStockDTO.java           # DTO con Lombok para PATCH de stock
 ┃ ┃ ┃ ┣ 📂 Repository
 ┃ ┃ ┃ ┃ ┗ 📜 ProductoRepository.java           # Interfaz JPA Repository
 ┃ ┃ ┃ ┣ 📂 Service
 ┃ ┃ ┃ ┃ ┗ 📜 ProductoService.java              # Lógica de negocio
 ┃ ┃ ┃ ┣ 📂 Controller
 ┃ ┃ ┃ ┃ ┗ 📜 ProductoController.java           # Endpoints REST
 ┃ ┃ ┃ ┣ 📂 Exception
 ┃ ┃ ┃ ┃ ┣ 📜 ProductoNotFoundException.java
 ┃ ┃ ┃ ┃ ┣ 📜 StockInsuficienteException.java
 ┃ ┃ ┃ ┃ ┣ 📜 ErrorResponse.java
 ┃ ┃ ┃ ┃ ┗ 📜 GlobalExceptionHandler.java
 ┃ ┃ ┃ ┗ 📜 ProductosApiApplication.java        # Clase principal
 ┃ ┃ ┗ 📂 Resources
 ┃ ┃ ┃ ┗ 📄 application.properties              # Configuración
 ┃ ┗ 📂 test/java                               # Tests unitarios
 ┗ 📄 pom.xml                                   # Dependencias Maven
```
 
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
**Año:** 3er Año - 2do Semestre - 2025  
**Email:** mateodelucamontanaro@gmail.com

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.

---
