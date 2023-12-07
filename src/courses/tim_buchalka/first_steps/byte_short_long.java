package courses.tim_buchalka.first_steps;

public class byte_short_long {
    public static void main(String[] args) {
        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        //int width = 32 (in bits)
        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        //byte width = 8 (in bits)
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        //short width = 16 (in bits)
        System.out.println("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        long myLongValue = 100L;
        System.out.println("A Long has a width of " + Long.SIZE);
    }
}
