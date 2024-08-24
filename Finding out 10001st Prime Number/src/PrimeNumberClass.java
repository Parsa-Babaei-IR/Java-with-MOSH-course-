/**
 * Author : Parsa Babaei
 * Date : 8/24/2024
 */

/**
 * In this question I'll solve the problem 7
 * which i found it ProjectEuler.net
 */

/**
 * Problem : 10001st Prime
 */

public class PrimeNumberClass {
    /**
     * Declare our beginning Point
     * This parameters will tell to our for
     * conditions we are looking for ?st prime number
     */
    private int beginingPoint;

    /**
     * create our constructor
     * @param beginingPoint
     */
    private  void PrimeNumberClass(int beginingPoint) {
        this.beginingPoint = beginingPoint;
    }

    public int  getBeginingPoint() {
        return beginingPoint;
    }

    public void setBeginingPoint(int beginingPoint) {
        this.beginingPoint = beginingPoint;
    }

    public int result() {
        int checker = 1;
        int number = 2 ;
        boolean isTrue = true ;
        while (isTrue) {
            number++ ;
            /**
             * Following loop will fo through
             * each number and see that is a prime or not
             */
               boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            /**
             * Following "if" will see if the number was or not
             * If it was Prime then we increment counter
             */

            if (isPrime) {
                    checker++;
                }
            /**
             * This statment check our step
             * do we reach to ?st prime number or not
             * If yes then break the "while" loop
             */
            if (checker == beginingPoint ){
                isTrue = false ;
            }

            }

        return number;
        }

    }


