package courses.tim_buchalka.first_steps;

public class primitive_types_challange {
    public static void main(String[] args) {
        byte byteValue = 120;
        short shortValue = 12345;
        int intValue = 9999999;
        int sumOfThree = (byteValue + shortValue + intValue);
        long longValue = 50000 + 10 * (sumOfThree);
        System.out.println(longValue);
    }
}
