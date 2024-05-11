

class Conclusion {

    public Conclusion(int score, String name) {
        Introduction introduction = new Introduction();

        introduction.textAnimation("████████╗██╗░░██╗░█████╗░███╗░░██╗██╗░░██╗      ██╗░░░██╗░█████╗░██╗░░░██╗");
        introduction.textAnimation("╚══██╔══╝██║░░██║██╔══██╗████╗░██║██║░██╔╝      ╚██╗░██╔╝██╔══██╗██║░░░██║");
        introduction.textAnimation("░░░██║░░░███████║███████║██╔██╗██║█████═╝░      ░╚████╔╝░██║░░██║██║░░░██║");
        introduction.textAnimation("░░░██║░░░██╔══██║██╔══██║██║╚████║██╔═██╗░      ░░╚██╔╝░░██║░░██║██║░░░██║");
        introduction.textAnimation("░░░██║░░░██║░░██║██║░░██║██║░╚███║██║░╚██╗      ░░░██║░░░╚█████╔╝╚██████╔╝");
        introduction.textAnimation("░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝      ░░░╚═╝░░░░╚════╝░░╚═════╝░");

        //Ascii Art
        System.out.println("Here is your results!");

        introduction.textAnimation2("Name : "+ name);
        introduction.textAnimation2("Your score is: " + score);
        introduction.textAnimation2("Your accuracy is " + String.format("%.2f", (double) score / 15 * 100) + "%");
        //String format is for limiting decimal points, so it won't go 6.7777777777777777. instead only 6.77





    }
}