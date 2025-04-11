# Syna - Backend

🔐 RESTful API for secure URL shortening, built with Spring Boot and JWT authentication.

![Syna Backend Banner](https://i.ibb.co/6cKpjdNL/logo-For-Readme.png)

---

## 🛠 Technologies

- Java 17
- Spring Boot 3
- Spring Security
- JWT Authentication
- PostgreSQL
- Hibernate / JPA

---

## ✨ Features

- Register and login with secure JWT
- Create short URLs linked to real URLs
- Redirect via `/{shortCode}`
- View and manage user-specific URLs
- Secure routes with role-based access

---

## 🧑‍💻 Getting Started

```bash
# Clone the repository
git clone https://github.com/luiz-matoso/syna-backend.git

# Navigate to the project
cd syna-backend

# Run the application
./mvnw spring-boot:run
```

### 🔧 Configuration

Edit the `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/syna
spring.datasource.username=your_username
spring.datasource.password=your_password

jwt.secret=your_secret_key
```

---

## 📡 API Endpoints

| Method | Endpoint             | Description                     |
|--------|----------------------|---------------------------------|
| POST   | `/api/auth/public/register`   | Register new user               |
| POST   | `/api/auth/public/login`   | Authenticate and return token  |
| POST   | `/api/urls/shorten`           | Create a short URL              |
| GET    | `/api/urls/myurls`       | Get all urls        |
| GET    | `/api/urls/totalClicks?startDate=2025-01-01&endDate=2025-12-31`        | URL analytics |

---

## 📁 Project Structure

```
syna-backend/
├── controller/
├── model/
├── repository/
├── security/
├── service/
└── SynaApplication.java
```

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).