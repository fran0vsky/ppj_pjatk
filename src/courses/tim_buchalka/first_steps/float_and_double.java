package courses.tim_buchalka.first_steps;

public class float_and_double {
    public static void main(String[] args) {
        System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
        int myIntValue = 5;
        System.out.println(myIntValue);
        float myFloatValue = 5;
        System.out.println(myFloatValue);
        double myDoubleValue = 5;
        System.out.println(myDoubleValue);
        //float myOtherFloatValue = 5.25; error!
        float myOtherFloatValue = 5.25f;
        System.out.println(myOtherFloatValue);

    }
}
