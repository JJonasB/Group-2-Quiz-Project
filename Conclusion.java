
class Conclusion {

    public Conclusion(int score) {
        System.out.println("Your score is: " + score);
        System.out.println("Your accuracy is " + String.format("%.2f", (double) score / 15 * 100) + "%");
        //String format is for limiting decimal points, so it won't go 6.7777777777777777. instead only 6.77

    }
}