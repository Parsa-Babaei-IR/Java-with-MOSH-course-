/**
 * Author : Parsa Babaei
 * Date : 8/23/2024
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Instantiation for SumSquareClass
         */
        var Summation = new SumSquareDifference();
        int result = Summation.result();
        int result2 = Summation.result2();
        //Printing out the result
        System.out.printf("Sum Square Difference :%d " , (result2 - result));

    }

}