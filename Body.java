import java.util.Scanner;

public class Body {
    private String answer;
    private int correct = 0;
    private boolean checker;
    Scanner input = new Scanner(System.in);


    public Body() {
        //Question 1
        System.out.print("""
                1. What is HTML?
                - A) Hyper Text Markup Language
                - B) High-Level Text Manipulation Language
                - C) Hyper Transfer Markup Language
                - D) Hyperlink Text Management Language
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("A")) {
            correct++;
        } else {
            input.nextLine(); //This clears the previous answer just in case something goes wrong
        }

    }

    int getCorrectAnswers() {
        return correct;
    }
}
