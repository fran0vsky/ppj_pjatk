package courses.tim_buchalka.first_steps;

public class primitive_types {
    public static void main(String[] args) {

        //Primitive Types:
        //
        //Whole number;
        //-byte
        //-short
        //-int
        //-long
        //Real number;
        //-float
        //-double
        //Single character;
        //-char
        //Boolean value
        //-boolean

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Integer Value Range (" + myMinIntValue + " to " + myMaxIntValue + ")" );

        System.out.println(myMaxIntValue + 1); //Overflow situation
        System.out.println(myMinIntValue - 1); //Underflow situation

       //int myMaxIntTest = 2147483648  Error - " java: integer number too large "
       //int willThisCompile = (myMaxIntValue + 1);
       //System.out.println(willThisCompile);           Overflow
       //int willThisCompile2 = (2147483647 + 1);
       //System.out.println(willThisCompile2);          Overflow

    }
}
