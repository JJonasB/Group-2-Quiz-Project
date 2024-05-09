import java.util.Scanner;

public class Introduction {
    public void start() {
        textAnimation("░██████╗░██████╗░░█████╗░██╗░░░██╗██████╗░  ██████╗░");
        textAnimation("██╔════╝░██╔══██╗██╔══██╗██║░░░██║██╔══██╗  ╚════██╗");
        textAnimation("██║░░██╗░██████╔╝██║░░██║██║░░░██║██████╔╝  ░░███╔═╝");
        textAnimation("██║░░╚██╗██╔══██╗██║░░██║██║░░░██║██╔═══╝░  ██╔══╝░░");
        textAnimation("╚██████╔╝██║░░██║╚█████╔╝╚██████╔╝██║░░░░░  ███████╗");
        textAnimation("░╚═════╝░╚═╝░░╚═╝░╚════╝░░╚═════╝░╚═╝░░░░░  ╚══════╝");

    textAnimation2("This quiz contains about three programming languages, it is all about HTML, CSS, and JAVASCRIPT.\nIt has 15 questions with multiple choice, offering 4 choices for every question.\nThere's only one correct answer, so read carefully and answer seriously.\nGood luck!\n");
    textAnimation2("Press Enter to Continue");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }


    void textAnimation(String text) {
        try {
                System.out.print(text);
                Thread.sleep(250);
        } catch (InterruptedException e) {
            System.out.println("Something interrupted the program");
        }
        System.out.println();
    }

    void textAnimation2(String text) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            System.out.println("Something interrupted the program");
        }
        System.out.println();
    }
}
