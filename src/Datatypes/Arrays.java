package Datatypes;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] digits = {4,2,15,454,12,16};

        System.out.println(java.util.Arrays.toString(digits));
        System.out.println(digits.length);

        int chosen = digits[3];
        System.out.println(chosen);
    }
}
