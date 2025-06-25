#Student Record Management System
A command-line interface (CLI) application built in Java to manage student records with full CRUD (Create, Read, Update, Delete) functionality. This project demonstrates object-oriented programming principles, data structure usage (ArrayList), and modular design with a clear separation of concerns.

##Table of Contents:
Project Overview
Features
Technologies Used
Project Structure
Setup Instructions
How to Use
Key Concepts Demonstrated

##Project Overview
The Student Record Management System is a CLI-based application designed to manage student records efficiently. Users can add, view, update, delete, and retrieve individual student details through a simple menu-driven interface. The project uses a layered architecture (Models, Repositories, Services) to ensure modularity and maintainability.
Features

Add Student: Create a new student record with ID, name, and marks.
View All Students: Display a list of all students with their details.
View Single Student: Retrieve details of a specific student by ID.
Update Student: Modify the name and marks of an existing student.
Delete Student: Remove a student record by ID.
Exit: Terminate the application.

##Technologies Used:
Java: Core programming language.
ArrayList: For dynamic storage of student records.
Scanner: For capturing user input via CLI.
Builder Pattern: For creating immutable Student objects.
VS Code/IntelliJ CE: Development environment.

##Project Structure
StudentRecordManagementSystem/
├── Models/
│   └── Student.java        // Student class with fields (id, name, marks) and Builder pattern
├── Repositories/
│   └── StudentRepo.java    // Manages storage and retrieval of student records using ArrayList
├── Services/
│   └── StudentService.java // Handles business logic and user input for CRUD operations
├── Main.java               // CLI menu and program entry point
└── README.md               // Project documentation

##Setup Instructions:
```
Clone the Repository:git clone https://github.com/TusharSanisare/StudentRecordManagement_2
Navigate to Project Directory:cd StudentRecordManagementSystem
Compile the Code:javac Main.java
Run the Application:java Main
```


Launch the application by running java Main.
The CLI displays a menu with the following options:
0: Exit the program
1: Add a new student
2: View all students
3: Delete a student
4: Update a student
5: View a single student


Enter the desired option (0–5) and follow the prompts to input student details (ID, name, marks).
The system provides feedback for each operation (e.g., "Student saved successfully").

##Key Concepts Demonstrated
Object-Oriented Programming: Classes, encapsulation, and the Builder pattern.
Data Structures: Use of ArrayList for dynamic storage.
Modular Design: Separation of concerns with Models, Repositories, and Services layers.
CLI Interaction: User input handling using Scanner.
CRUD Operations: Full implementation of create, read, update, and delete functionality.
