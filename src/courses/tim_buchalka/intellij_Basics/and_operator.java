package courses.tim_buchalka.intellij_Basics;

public class and_operator {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
