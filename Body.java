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

        System.out.print("""
                2. What is the basic structure of an HTML document?
               - A) <html><head><body>
               - B) <head><body><html>
               - C) <body><head><html>
               - D) <html><body><head>
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("A")) {
            correct++;
        } else {
            input.nextLine();
        }

        System.out.print("""
                3. What are HTML elements and tags?
               - A) Elements are the opening tags, and tags are the closing tags.
               - B) Elements and tags are the same thing.
               - C) Tags define the format, and elements represent the content.
               - D) Elements are used for styling, and tags are used for structure.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("C")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 4
        System.out.print("""
                4. What does CSS stand for, and why is it important in web development?
                 - A) Cascading Style Sheets; it defines the layout and presentation of web pages.
                 - B) Creative Styling System; it enhances user experience.
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
                      - B) By using percentage-based widths and media queries.
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
                          - B) To link external stylesheets.
                          - C) To uniquely identify elements (id) or group them (class) for styling or JavaScript manipulation.
                          - D) To create hyperlinks.
                Your answer:\s""");
        answer = input.next();
        if ( answer.equalsIgnoreCase("C") ) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 7
        System.out.print("""
                7. Describe Floats and how they work in CSS.
                - A) Floats are used to make elements vertically centered.
                - B) Floats are used to create responsive layouts.
                - C) Floats are used to position elements horizontally within their container.
                - D) Floats are used to create drop-down menus.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("C")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 8
        System.out.print("""
                8. Which CSS property is used to change the text color?
                - A) text-align
                - B) font-style
                - C) color
                - D) background-color
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("C")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 9
        System.out.print("""
                9. What is the purpose of the "console.log" function in JavaScript?
                - A) It displays messages in the browser's console for debugging purposes.
                - B) It creates new elements in the HTML document.
                - C) It defines variables and constants in JavaScript.
                - D) It loads external JavaScript libraries.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("A")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 10
        System.out.print("""
                10. What is the purpose of the "src" attribute in HTML image tags?
                - A) It specifies the size of the image.
                - 😎 It defines the position of the image on the webpage.
                - C) It specifies the source URL or file path of the image.
                - D) It sets the background color of the image.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("*C*")) {
            correct++;
        } else {
            input.nextLine();
        }


        //Question 11
        System.out.print("""
                11. What is the purpose of the "innerHTML" property in JavaScript?
                - A) It retrieves the inner text of an HTML element.
                - B) It sets the inner HTML content of an element, replacing any existing content.
                - C) It modifies the CSS styles of an HTML element.
                - D) It creates a new HTML element with specified inner HTML content.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("*B*")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 12
        System.out.print("""
                12. What is the difference between "==" and "===" operators in JavaScript?
                - A) They perform the same comparison but with different syntax.
                - B) "==" compares both value and type, while "===" compares only the value.
                - C) "==" compares only the value, while "===" compares both value and type.
                - D) "==" is used for mathematical operations, while "===" is used for logical operations.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("*C*")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 13
        System.out.print("""
                13. Which tag is used to create a hyperlink in HTML?
                - A) <link>
                - B) <href>
                - C) <a>
                - D) <url>
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("C")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 14
        System.out.print("""
                14. What does the "type" attribute in HTML input tags specify?
                - A) The input's color.
                - B) The input's width.
                - C) The input's type, such as text, number, or email.
                - D) The input's position on the page.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("C")) {
            correct++;
        } else {
            input.nextLine();
        }

        //Question 15
        System.out.print("""
                15. What does the "display" property in CSS control?
                - A) The font size of text.
                - B) The visibility of an element.
                - C) The layout and rendering of an element.
                - D) The alignment of text within an element.
                Your answer:\s""");
        answer = input.next();
        if (answer.equalsIgnoreCase("C")) {
            correct++;
        } else {
            input.nextLine();
        }

        input.close(); //Closes the scanner
    }


    int getCorrectAnswers() {
        return correct;
    }
}