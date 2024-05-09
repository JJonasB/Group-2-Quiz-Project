import java.util.Scanner;

public class Body {
    private String answer;
    private int correct = 0;
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
        if ( answer.equalsIgnoreCase("A") ) {
            correct++;
        } else {
            input.nextLine(); //This clears the previous answer just in case something goes wrong
        }

        //Question 4
        System.out.print("""
                4. What does CSS stand for, and why is it important in web development?
                 - A) Cascading Style Sheets; it defines the layout and presentation of web pages.
                 - B.) Creative Styling System; it enhances user experience.
                 - C) Centralized Styling Solution; it simplifies code organization.
                 - D) Colorful Styling Styles; it adds visual appeal to websites.
                Your answer:\s""");
        answer = input.next();
        if ( answer.equalsIgnoreCase("A") ) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 5
        System.out.print("""
                5. How do you create a responsive layout in CSS?
                      - A) By using fixed pixel widths for all elements.
                      - B.) By using percentage-based widths and media queries.
                      - C) By avoiding any layout adjustments for different screen sizes.
                      - D) By using absolute positioning for all elements.
                Your answer:\s""");
        answer = input.next();
        if ( answer.equalsIgnoreCase("B") ) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 6
        System.out.print("""
                6. What is the purpose of the HTML id and class attributes?
                          - A) To define the type of HTML element.
                          - B.) To link external stylesheets.
                          - C) To uniquely identify elements (id) or group them (class) for styling or JavaScript manipulation.
                          - D) To create hyperlinks.
                Your answer:\s""");
        answer = input.next();
        if ( answer.equalsIgnoreCase("C") ) {
            correct++;
        } else {
            input.nextLine();
        }
    }


    int getCorrectAnswers() {
        return correct;
    }
}