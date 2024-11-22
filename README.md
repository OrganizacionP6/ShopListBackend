Lista de la Compra - Backend
Este proyecto es el backend del sistema de la Lista de la Compra, que proporciona una API REST para gestionar productos. El sistema incluye un frontend basado en la implementación anterior, que interactúa con este backend. El backend utiliza una base de datos H2 en memoria para almacenar los productos.

🛠️ Características
El sistema ofrece las siguientes funcionalidades:

Crear un producto:
Permite agregar un nuevo producto con un nombre, cantidad y precio.

Eliminar un producto:
Permite eliminar un producto específico mediante su ID.

Buscar un producto por ID:
Permite consultar los detalles de un producto específico utilizando su identificador único.

Buscar todos los productos:
Devuelve la lista completa de productos almacenados en la base de datos.

⚙️ Tecnologías utilizadas
Backend:

Java
Spring Boot 3.3.5
Spring Data JPA
H2 Database
Frontend:

Basado en la implementación anterior de la Lista de la Compra.
📦 Estructura del Proyecto
plaintext
Copiar código
src/main/java/
├── controller/         # Controladores REST
├── service/            # Lógica de negocio
├── repository/         # Acceso a datos
├── model/              # Entidades JPA
└── application/        # Punto de entrada principal (Spring Boot Application)
🚀 Cómo ejecutar el proyecto
Requisitos previos
Tener instalado Java 17 o superior.
Tener configurada una herramienta de construcción como Maven o utilizar el soporte integrado de IntelliJ IDEA.
Pasos para ejecutar:
Clona este repositorio:

bash
Copiar código
git clone https://github.com/OrganizacionP6/ShoplistBackend.git
cd ShoplistBackend
Compila y ejecuta el proyecto usando Maven:

bash
Copiar código
mvn spring-boot:run
Accede a la API REST en:

arduino
Copiar código
http://localhost:8080
La consola H2 está disponible en:

bash
Copiar código
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Usuario: sa
Contraseña: (dejar en blanco)
📚 Rutas de la API
Productos
Método	Endpoint	Descripción
POST	/api/products	Crear un nuevo producto.
DELETE	/api/products/{id}	Eliminar un producto por ID.
GET	/api/products/{id}	Buscar un producto por ID.
GET	/api/products	Obtener todos los productos.
🗄️ Ejemplo de un Producto
json
Copiar código
{
  "id": 1,
  "name": "Manzana",
  "quantity": 10,
  "price": 2.50
}
