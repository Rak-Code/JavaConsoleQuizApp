package files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public int start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Answer the following questions by typing the number corresponding to your choice.");

        for (Question question : questions) {
            System.out.println("\n" + question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + options[question.getCorrectOption() - 1]);
            }
        }

        System.out.println("\nQuiz completed!");
        return score; // Return the final score
    }
}
