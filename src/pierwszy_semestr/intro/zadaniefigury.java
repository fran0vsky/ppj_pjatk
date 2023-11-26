package pierwszy_semestr.intro;

public class zadaniefigury {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 4) + 1;

        switch (number) {
            case 1:
                drawOdwroconytrojkat();
                break;
            case 2:
                drawKwadrat();
                break;
            case 3:
                drawRomb();
                break;
            case 4:
                drawProstokat();
                break;

        }
    }

    public static void drawOdwroconytrojkat() {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawKwadrat() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRomb() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void drawProstokat() {
        int rows = 4, columns = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}












