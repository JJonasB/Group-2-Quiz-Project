public class Main {
    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        introduction.start();

        Body body = new Body();

        Conclusion conclusion = new Conclusion(15, introduction.getName());
    }
}
