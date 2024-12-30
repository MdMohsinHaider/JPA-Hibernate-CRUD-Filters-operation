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
# Project Lombok

Project Lombok is a powerful Java library that simplifies coding by generating boilerplate code at compile time, making your code concise and clean. Below are some of the most commonly used annotations in Project Lombok and their functionalities.

---

## Annotations

### `val`
**Finally! Hassle-free final local variables.**
- Automatically declares a final local variable with inferred type.
- Syntax: `val variableName = value;`
- Example:
  ```java
  val name = "Lombok"; // Inferred as final String name
  ```

### `var`
**Mutably! Hassle-free local variables.**
- Declares a mutable local variable with inferred type.
- Syntax: `var variableName = value;`
- Example:
  ```java
  var count = 10; // Inferred as int count
  ```

### `@NonNull`
**Or: How I learned to stop worrying and love the NullPointerException.**
- Automatically generates null checks for fields or method parameters.
- Example:
  ```java
  public void setName(@NonNull String name) {
      this.name = name; // Throws NullPointerException if name is null
  }
  ```

### `@Cleanup`
**Automatic resource management: Call your `close()` methods safely with no hassle.**
- Ensures that resources are properly closed at the end of the scope.
- Example:
  ```java
  @Cleanup InputStream in = new FileInputStream("file.txt");
  ```

### `@Getter` / `@Setter`
**Never write `public int getFoo() {return foo;}` again.**
- Automatically generates getter and setter methods for fields.
- Example:
  ```java
  @Getter @Setter private String name;
  ```

### `@ToString`
**No need to start a debugger to see your fields: Just let Lombok generate a `toString` for you!**
- Generates a `toString` method that includes class fields.
- Example:
  ```java
  @ToString
  public class Person {
      private String name;
      private int age;
  }
  ```

### `@EqualsAndHashCode`
**Equality made easy: Generates `hashCode` and `equals` implementations from the fields of your object.**
- Example:
  ```java
  @EqualsAndHashCode
  public class Person {
      private String name;
      private int age;
  }
  ```

### `@NoArgsConstructor`, `@RequiredArgsConstructor`, and `@AllArgsConstructor`
**Constructors made to order.**
- `@NoArgsConstructor`: Generates a no-argument constructor.
- `@RequiredArgsConstructor`: Generates a constructor for final or `@NonNull` fields.
- `@AllArgsConstructor`: Generates a constructor for all fields.

### `@Data`
**All together now.**
- Combines `@ToString`, `@EqualsAndHashCode`, `@Getter` on all fields, `@Setter` on non-final fields, and `@RequiredArgsConstructor`.
- Example:
  ```java
  @Data
  public class Person {
      private final String name;
      private int age;
  }
  ```

### `@Value`
**Immutable classes made very easy.**
- Marks a class as immutable. Combines `@ToString`, `@EqualsAndHashCode`, `@Getter` on all fields, `@AllArgsConstructor`, and fields are `final` by default.
- Example:
  ```java
  @Value
  public class Person {
      String name;
      int age;
  }
  ```

### `@Builder`
**No-hassle fancy-pants APIs for object creation!**
- Generates a builder API for your class.
- Example:
  ```java
  @Builder
  public class Person {
      private String name;
      private int age;
  }
  ```

### `@SneakyThrows`
**To boldly throw checked exceptions where no one has thrown them before!**
- Allows methods to throw checked exceptions without declaring them in the method signature.
- Example:
  ```java
  @SneakyThrows
  public void readFile() {
      Files.readAllBytes(Paths.get("file.txt"));
  }
  ```

### `@Synchronized`
**Synchronized done right: Don't expose your locks.**
- Ensures thread-safe access to methods.
- Example:
  ```java
  @Synchronized
  public void safeMethod() {
      // Thread-safe code
  }
  ```

### `@With`
**Immutable 'setters' - methods that create a clone but with one changed field.**
- Example:
  ```java
  @With
  @Value
  public class Person {
      String name;
      int age;
  }
  ```

### `@Log`
**Captain's Log: Easy logging setup.**
- Generates a logger instance for the class.
- Variants include `@Log`, `@Slf4j`, `@Log4j`, etc.
- Example:
  ```java
  @Log
  public class MyClass {
      public void logSomething() {
          log.info("Logging is easy with Lombok!");
      }
  }
  ```

### Experimental Features
**Head to the lab: The new stuff we're working on.**
- Experimental features are available for testing. Use them with caution as they may change or be removed in future versions.

---

## How to Use

1. Add Lombok to your project:
    - **Maven:**
      ```xml
      <dependency>
          <groupId>org.projectlombok</groupId>
          <artifactId>lombok</artifactId>
          <version>YOUR_VERSION</version>
          <scope>provided</scope>
      </dependency>
      ```
    - **Gradle:**
      ```gradle
      compileOnly 'org.projectlombok:lombok:YOUR_VERSION'
      annotationProcessor 'org.projectlombok:lombok:YOUR_VERSION'
      ```

2. Enable annotation processing in your IDE.

---

## Documentation
For detailed documentation, visit the [official Project Lombok site](https://projectlombok.org/).

---

## Contributing
Contributions are welcome! Feel free to create issues or submit pull requests.

---

## License
Project Lombok is licensed under the MIT License.

# Jakarta Persistence (JPA)

Jakarta Persistence (JPA) is a Jakarta EE specification for managing relational data in Java applications. It provides an Object-Relational Mapping (ORM) framework, enabling developers to interact with databases using Java objects.

## Key Features

- **Annotations**: Use annotations to define mappings between Java objects and database tables.
- **Entity Classes**: Represent tables in the database.
- **Queries**: Utilize JPQL (Jakarta Persistence Query Language) for database operations.
- **Transactions**: Manage database transactions declaratively.
- **Relationships**: Model relationships between entities.

## Setting Up JPA

1. Add the Jakarta Persistence dependency to your project.
2. Define the `persistence.xml` file in the `META-INF` directory.
3. Annotate your entity classes with `@Entity` and map fields to table columns.
4. Use the `EntityManager` to persist and retrieve data.

## Multiplicity in Entity Relationships

Multiplicity defines the type of relationships between entities and is categorized as follows:

### One-to-One
Each entity instance is related to a single instance of another entity. For example, a storage bin containing a single widget represents a one-to-one relationship. Use the `jakarta.persistence.OneToOne` annotation.

### One-to-Many
An entity instance can be related to multiple instances of another entity. For example, a sales order can have multiple line items. Use the `jakarta.persistence.OneToMany` annotation.

### Many-to-One
Multiple instances of an entity can relate to a single instance of another entity. For example, multiple line items belonging to one customer order represent a many-to-one relationship. Use the `jakarta.persistence.ManyToOne` annotation.

### Many-to-Many
Entities can relate to multiple instances of each other. For example, students and courses in a university system. Use the `jakarta.persistence.ManyToMany` annotation.

## Direction in Entity Relationships

### Bidirectional Relationships
Both entities in the relationship reference each other. Rules for bidirectional relationships include:
- The inverse side must use the `mappedBy` element.
- The many side of a many-to-one relationship is the owning side.
- For one-to-one relationships, the owning side contains the foreign key.
- For many-to-many relationships, either side can be the owning side.

### Unidirectional Relationships
Only one entity references the other. For example, a `LineItem` references a `Product`, but the `Product` does not reference the `LineItem`.

## Queries and Relationship Direction
The direction of relationships determines how queries navigate entities. For example, queries can navigate from `LineItem` to `Product` in a unidirectional relationship but not in the opposite direction.

## Cascade Operations and Relationships

Cascade operations define how changes in one entity affect related entities. These operations include:

- **ALL**: Applies all cascade operations.
- **DETACH**: Detaches related entities.
- **MERGE**: Merges related entities.
- **PERSIST**: Persists related entities.
- **REFRESH**: Refreshes related entities.
- **REMOVE**: Removes related entities.

Use `cascade=REMOVE` for cascade delete relationships. For example:

```java
@OneToMany(cascade=REMOVE, mappedBy="customer")
public Set<CustomerOrder> getOrders() { return orders; }
```

### Orphan Removal
Specifies that orphaned entities should be removed. For example:

```java
@OneToMany(mappedBy="customer", orphanRemoval=true)
public List<CustomerOrder> getOrders() { ... }
```

## Embeddable Classes in Entities

Embeddable classes represent state without a persistent identity. Use the `jakarta.persistence.Embeddable` annotation for such classes. Example:

```java
@Embeddable
public class ZipCode {
    String zip;
    String plusFour;
    ...
}

@Entity
public class Address {
    @Embedded
    ZipCode zipCode;
    ...
}
```

## Entity Inheritance
Entities support inheritance, polymorphic associations, and polymorphic queries.

### Abstract Entities
Abstract classes can be entities. For example:

```java
@Entity
public abstract class Employee {
    @Id
    protected Integer employeeId;
    ...
}

@Entity
public class FullTimeEmployee extends Employee {
    protected Integer salary;
    ...
}

@Entity
public class PartTimeEmployee extends Employee {
    protected Float hourlyWage;
}
```

