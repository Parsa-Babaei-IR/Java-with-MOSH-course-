/**
 * Author : Parsa Babaei
 * Date : 8/22/2024
 */

/**
 *
 * This is our main class to
 * print out our result
 */
public class Main {
    public static void main(String[] args) {
        var fiboNumber = new CalculationClass();
        long result = fiboNumber.sumOfEvenFibo();
        System.out.println(result);
    }
}