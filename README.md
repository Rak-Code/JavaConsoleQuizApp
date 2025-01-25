# Java Console-Based Quiz Application with JDBC Integration

## Overview
This project is an interactive console-based quiz application written in Java. It focuses on Object-Oriented Programming (OOP) concepts and includes integration with a MySQL database using JDBC to store user details and their scores. Users can take the quiz, receive instant feedback, and have their performance saved to the database.

---

## Features
- **User Details Input**: Users provide their name before starting the quiz.
- **Dynamic Questions**: The quiz includes multiple-choice questions on Java OOP concepts.
- **Score Calculation**: The application calculates and displays the user's score at the end of the quiz.
- **Database Integration**: User details and scores are stored in a MySQL database using JDBC.
- **Clean and Modular Code**: The project follows OOP principles for better readability and maintainability.

---

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or later.
- **MySQL Server**: Version 5.7 or later.
- **JDBC Driver**: MySQL Connector/J (compatible with your MySQL version).
- **IDE or Text Editor**: IntelliJ IDEA, Eclipse, VS Code, or any other editor.
- **Command Line or Terminal**: To run the program.

---

## Database Setup
1. **Create a Database**:
   ```sql
   CREATE DATABASE quiz_db;
   USE quiz_db;
   ```
2. **Create the `quiz_scores` Table**:
   ```sql
   CREATE TABLE quiz_scores (
       id INT AUTO_INCREMENT PRIMARY KEY,
       user_name VARCHAR(255) NOT NULL,
       score INT NOT NULL
   );
   ```
3. **Grant Permissions**:
   Ensure your MySQL user has permission to insert and read data from the database.

---

## Project Structure
```
QuizApp/
├── src/
│   ├── Main.java        // Entry point of the program
│   ├── Question.java    // Represents a quiz question
│   ├── Quiz.java        // Handles the quiz logic
│   └── Database.java    // Manages database connection and operations
└── README.md            // Project documentation
```

---

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Rak-Code/QuizApp.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd QuizApp/src
   ```
3. **Add the JDBC Driver**:
   - If using Maven, add the dependency to `pom.xml`:
     ```xml
     <dependency>
         <groupId>mysql</groupId>
         <artifactId>mysql-connector-java</artifactId>
         <version>8.0.33</version>
     </dependency>
     ```
   - If not using Maven, download the driver and add it to the project classpath.

4. **Compile the Java Files**:
   ```bash
   javac *.java
   ```
5. **Run the Application**:
   ```bash
   java Main
   ```

---

## How to Play
1. When the application starts, enter your name when prompted.
2. Answer the questions by typing the number corresponding to your choice and pressing Enter.
3. Receive feedback on whether your answer was correct or wrong after each question.
4. At the end, view your total score.
5. Your name and score will be saved to the MySQL database.

---

## Sample Output Flow
```
Welcome to the Java Quiz!
Please enter your name: John Doe

Answer the following questions by typing the number corresponding to your choice.

1. Which of the following is not a principle of OOP?
   1. Encapsulation
   2. Polymorphism
   3. Inheritance
   4. Compilation
Your answer: 4
Correct!

2. Which feature of OOP allows creating a new class from an existing class?
   1. Encapsulation
   2. Inheritance
   3. Polymorphism
   4. Abstraction
Your answer: 2
Correct!

Quiz Over! Your score: 2
Score saved to the database successfully!
Thank you for playing!
```

---

## Future Enhancements
- Add a feature to display the top scores from the database.
- Add support for more question categories and difficulty levels.
- Convert the console application into a web or GUI-based application using JavaFX or Spring Boot.
- Track the time taken to complete the quiz.

---

## License
This project is open-source and available under the [MIT License](LICENSE).

---

## Author
**Rak-Code**  
[GitHub Profile](https://github.com/Rak-Code)

