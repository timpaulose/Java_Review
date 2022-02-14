package Datatypes;

public class Operators {
    public static void main(String[] args) {

        //Declare a variable named value of the data type int that is assigned the value 50
        //Secondly, declare a variable named another_value of the data type double that is assigned the value 30.2

        int value = 50;
        double another_value = 30.2;

        //Convert the variable value from data type int to data type double. Save the new variable to a new variable value_double

        double value_double = value;
        System.out.println(value_double);   //50.0
        System.out.println(value);          //50

        /**
         *
         * In Java type casting is when you assign a value of one PRIMITIVE data type to another type
         *
         * Widening Casting (automatic) - converting a smaller type to a larger type
         *  int>long    byte > int      float > double
         * Narrowing Casting (manual)   - converting a larger type to a smaller type
         * double >float    int>byte    long>short  double>int
         *
         */

        //WIDENING CASTING
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //NARROWING CASTING
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int (put datatype into parantheses in front of the value)

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9



        //Add the variable value and another_value and assign the value to a new variable which is assigned the name sum_value of type double
        //Print the result

    }
}
