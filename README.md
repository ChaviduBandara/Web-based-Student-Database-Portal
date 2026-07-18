# Student Management System

A full-stack **Student Management System** built with **Spring Boot**, **JavaScript**, and **MySQL**. This application allows teachers or administrators to manage student records through a simple web interface by performing CRUD (Create, Read, Update, Delete) operations.

---

## 🚀 Features

- Add new student records
- View all students
- Update existing student details
- Delete student records
- Search students by name
- RESTful API built with Spring Boot
- MySQL database integration
- Simple JavaScript frontend for interacting with the backend

---

## 🛠️ Technologies Used

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Maven
- MySQL

### Frontend
- HTML
- CSS
- JavaScript

### Database
- MySQL

---

## 📂 Project Structure

```
src
├── controller
├── service
├── repository
├── dto
├── entity
└── resources
```

---

## ⚙️ REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/` | Get all students |
| POST | `/` | Add a new student |
| PUT | `/` | Update a student |
| DELETE | `/{id}` | Delete a student by ID |
| GET | `/find-by-name/{name}` | Search students by name |

---

## 🗄️ Database Configuration

Update your `application.properties` file with your MySQL credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/student-management-system.git
```

### 2. Navigate to the project

```bash
cd student-management-system
```

### 3. Create the MySQL database

```sql
CREATE DATABASE student_db;
```

### 4. Configure MySQL

Update the database username and password in `application.properties`.

### 5. Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main Spring Boot application from your IDE.

The backend will start on:

```
http://localhost:8080
```

---

## 📸 Screenshots

You can add screenshots here after uploading your project.

Example:

```
screenshots/
├── home.png
├── add-student.png
└── search.png
```

---

## 📌 Future Improvements

- User authentication (Admin/Teacher login)
- Pagination
- Input validation
- Exception handling
- Student profile images
- Docker support
- Unit and integration testing

---

## 👨‍💻 Author

**Chavindu Bandara**

Software Engineering Undergraduate

---

## 📄 License

This project is open source and available under the MIT License.
