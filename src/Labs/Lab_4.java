package Labs;

public class Lab_4 {
    public static void main(String[] args) {

//        /**
//         *  Write a program to print numbers from 1 to 10.
//         *  use for-loop
//         */
//
//        //pseudocode
//        //1 , 2, 3,
//        //i, i++, i++
//
//
//        for(int i = 1 ; i <= 10 ; i++)
//        {
//            System.out.println(i);
//        }
//
//        /**
//         * Write a program to calculate the sum of first 10 natural number
//         * print the sum
//         *
//         * use for-loop
//         *
//         * natural number = 1,2,3,0,35233435 positive integer,whole integer
//         *
//         * 1+2+3+4+5+6+7+8+9+10
//         *
//         *
//         */
//
//       int num = 0;    //declare variable
////
////        for (int i=1; i <=10 ; i++ ){
////
////            num = num +i;
////            //1st loop -> 0 = 0 + 1
////            //2nd loop -> 1 = 1 + 2
////            //3rd loop -> 3 = 2 + 3
////        }
////        System.out.println(num);
//
//        /**
//         * Write sum of first 10 negative numbers
//         */
//
//        for (int i = 1; i <=10 ; i++){
//
//            num = num - i;
//
//        }
//        System.out.println(num);

        /**
         * print the names which contain Only - a
         */
        String[] allNames = {"king kang", "living people", "peaceful", "lively", "Apple", "BOMBARDMENT"};

        //[0].contains("a") //sout[0] - Will print
        //[1].contains("a") //sout[1] - will not print
        //

        //for-loop

        for (int i = 0; i <= allNames.length - 1; i++) {
            if (allNames[i].contains("a")) {
                System.out.println(allNames[i]);
            }
        }

        //while loop -> code will only run if condition is true, else nothing will be returned
        //while (condition){
            //code to run until condition is true
            //increment/decrement operator
        int w = 0;
        while (w <= allNames.length - 1){
            if (allNames[w].contains("a")){
                System.out.println(allNames[w]);

            }
            w++;
        }



        //do-while loop


        //enhanced for loop


        /**
         * Write a program which prints the even numbers between 1 and 100 in an increasing order
         *
         * result: 2,4,6,8,10,...,100
         * use for-loop
         * modulo -> %
         * increment i++
         *
         * for (initialization ; condition ; increment)
         * for (int i = 1; i <= ; i++){
         *      if( i % 2 == 0)
         */

        for (int i = 1; i <= 100; i++){
            if ( i % 2 == 0 ){
                System.out.println(i + " ");
            }

        }



    }
}
