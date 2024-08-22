
/**
 * Author : Parsa Babaei
 * Date : 8/22/2024
 */

/**
 * This code will find out the even Fibonacci
 * numbers from term 1 to term 15
 */
public class CalculationClass {
    /**
     * Declare two variables
     * With their default value
     * For Fibo terms
     * @param number1
     * @param number2
     */
    private long number1 = 0 ;
    private long number2 = 1 ;

    /**
     * Write our own constructor
     * For Calculation class
     */
//    private void CalculationClass (long number1 , long number2){
//        this.number1 = number1 ;
//        this.number2 = number2 ;
//    }
    private long getNumber1(){
        return number1 ;
    }
    private long getNumber2(){
        return number2 ;
    }
    private void setNumber1 (long number1){
        this.number1 = number1 ;
    }
    private void setNumber2 (long number2){
        this.number2 = number2 ;
    }

    /**
     * Following method will find out
     * summation of those EVEN Fibo term numbers
     * and return summation of them
     * @return
     */
    public long sumOfEvenFibo(){
        long number3 = 0;
        long sum = 0 ;
        while (number3   < 4_000_000){
            number3 = number1 + number2 ;
            if (number3 % 2 == 0 ){
                sum += number3 ;
            }
            number1 = number2 ;
            number2 = number3 ;

        }
        return (sum) ;
    }



}
