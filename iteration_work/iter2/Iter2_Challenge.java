import java.util.Scanner;

public class Iter2_Challenge {
 
    public static void main(String args[]) {
        String question = "What is the largest planet in our solar system";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";
 
        String correctAnswer = choiceTwo.toLowerCase();
 
        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("The answer choices are: " + choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);

        // Retrieve the user's input
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        if (correctAnswer.equals(input.toLowerCase())) {
        // then the user is correct, and we want to print out a congrats message to the user.
            System.out.println(choiceTwo + " is correct!");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect, and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {System.out.println("Incorrect. The correct answer is " + choiceTwo + ".");}
    }
}