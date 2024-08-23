/**
 * Author : Parsa Babaei
 * Date : 8/23/2024
 */


/**
 * In This code i will solve problem 6
 * which i found it in
 * https://projecteuler.net/
 */
public class SumSquareDifference {
    /**
     * Declaring our parameters
     */
    private int sumOfTheSquareOfTheFirstTenNaturalNumber = 0 ;
    private int squareOfTheSumOfTheFirstTheNaturalNUmber = 0;

    /**
     * Following class will find out
     * The square Of the sum of the first the natural nUmber
     */
    public int result(){
        for (int i = 1 ; i <= 100 ; i++){

            sumOfTheSquareOfTheFirstTenNaturalNumber += Math.pow(i, 2);

        }
        return sumOfTheSquareOfTheFirstTenNaturalNumber ;
    }

    /**
     * This class will find out
     * square of the sum of the first the natural number
     */
    public int result2 (){
        for (int i = 0 ; i <= 100 ; i++ ){
            squareOfTheSumOfTheFirstTheNaturalNUmber += i ;
        }
        return (int) Math.pow(squareOfTheSumOfTheFirstTheNaturalNUmber,2);
    }
}
