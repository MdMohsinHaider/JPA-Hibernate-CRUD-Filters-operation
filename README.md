# Laptop Management System

## Overview
The **Laptop Management System** is a Java-based application that utilizes JPA and Hibernate for managing a database of laptops. It provides CRUD functionality and various filter options to retrieve laptops by properties such as name, color, manufacture date, and price. The system is designed using the Maven project structure and follows scalable, modular coding practices for maintainability and extensibility.

## Features

### Core Features
1. **CRUD Operations**:
   - Create, Read, Update, and Delete laptops in the database.

2. **Filtering Laptops**:
   - Fetch laptops by:
     - Name
     - Color
     - Manufacture Date (within a range)
     - Price (within a range)

3. **Sorting Laptops**:
   - Display laptops in ascending or descending order by:
     - Price
     - Name
     - Manufacture Date

4. **Validation**:
   - Validates data formats and ensures logical consistency (e.g., date format, price ranges).

### Utility Features
- Helper methods for ID generation and validation.
- Exception handling for invalid inputs.

## Technologies Used

### Backend
- **Java**: Core programming language.
- **JPA & Hibernate**: ORM framework for database interaction.
- **Maven**: Dependency and project management.

### Database
- **MySQL** (or any RDBMS supported by Hibernate).

### Development Tools
- **IntelliJ IDEA**: IDE for Java development.
- **Maven**: Build and dependency management.

## Folder Structure

### Maven Standard Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── yourcompanyname/
│   │           └── projectname/
│   │               ├── service/                # Service layer
│   │               │   ├── LaptopService.java
│   │               │   └── LaptopServiceFilter.java
│   │               │
│   │               ├── dao/                    # Data access layer
│   │               │   └── LaptopDao.java
│   │               │
│   │               ├── entity/                 # Entity layer
│   │               │   └── Laptop.java
│   │               │
│   │               ├── util/                   # Utility classes
│   │               │   ├── ServiceHelper.java
│   │               │   └── ValidationUtils.java
│   │               │
│   │               └── Application.java        # Main entry point
│   │
│   └── resources/                              # Resource files
│       ├── META-INF/
│       │   └── persistence.xml
│       └── application.properties
│
└── test/
    ├── java/
    │   └── com/
    │       └── yourcompanyname/
    │           └── projectname/
    │               ├── dao/
    │               │   └── LaptopDaoTest.java
    │               └── service/
    │                   └── LaptopServiceTest.java
    └── resources/                              # Test-specific resources
```
## How to Run

 ## Prerequisites

  1. JDK 8+ installed on your system.
  
  2. Maven installed for dependency management.
  
  3. MySQL or a similar database installed.

### Steps

1. Clone the repository:
   ```
   https://github.com/MdMohsinHaider/Laptop_Management_System_using-JPA-Hibernate.git
   ```
2. Navigate to the project directory:
```
cd laptop-management-system
```
3. Update the database configuration in `persistence.xml` or `application.properties`.
4. Build the project using Maven:
```
mvn clean install
```
5. Run the application:
```
java -cp target/laptop-management-system-1.0-SNAPSHOT.jar com.yourcompanyname.projectname.Application
```

## How to Run

### Prerequisites
1. **JDK 8+** installed on your system.
2. **Maven** installed for dependency management.
3. **MySQL** or a similar database installed.

### Steps
1. Clone the repository:
   ```bash
   https://github.com/MdMohsinHaider/Laptop_Management_System_using-JPA-Hibernate.git
   ```


