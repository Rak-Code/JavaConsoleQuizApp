package files;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz!");
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question(
                "Which of the following is not a principle of OOP?",
                new String[]{"Encapsulation", "Polymorphism", "Inheritance", "Compilation"},
                4
        ));
        quiz.addQuestion(new Question(
                "Which feature of OOP allows creating a new class from an existing class?",
                new String[]{"Encapsulation", "Inheritance", "Polymorphism", "Abstraction"},
                2
        ));
        quiz.addQuestion(new Question(
        	    "Which of the following is a type of polymorphism in Java?",
        	    new String[] {
        	        "Compile-time polymorphism",
        	        "Runtime polymorphism",
        	        "Both Compile-time and Runtime",
        	        "None of the above"
        	    },
        	    3
        	));

        	quiz.addQuestion(new Question(
        	    "What is the process of defining a method in a subclass that already exists in the parent class?",
        	    new String[] {"Method Overriding", "Method Overloading", "Encapsulation", "Polymorphism"},
        	    1
        	));

        	quiz.addQuestion(new Question(
        	    "Which of the following is used to achieve abstraction in Java?",
        	    new String[] {"Abstract classes", "Interfaces", "Both Abstract classes and Interfaces", "None of the above"},
        	    3
        	));

        int score = quiz.start(); // This will now return the score
        System.out.println("Quiz Over! Your score: " + score);

        Database.saveScore(userName, score);
    }
}
