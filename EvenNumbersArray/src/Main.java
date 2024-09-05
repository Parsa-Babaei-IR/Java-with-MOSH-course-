import java.util.Scanner ;
class Main {
    public static void main(String[] args) {

        int range = 0 ; // Initialize zero to range
        Scanner scanner = new Scanner(System.in); // Insatantiate our scanner method
        var fillingArray = new FillingArray(); // Get an instantiation from, Filling Array method

        System.out.println("Plz enter desire range for your array :");
        range = scanner.nextInt(); //Assign user input to range
        /**
         Pass the range to the FillingArray Class
         and arrayOperation Method
        */
        fillingArray.arrayOperation(range);
        //Next line will compile the fillingArray class
        fillingArray.filingArray();


        /**
         Next line will get the mainArray from get method
         getArray will return our array
         Now we declare a local variables called mainArray exactly same
         as what we have in our filling array class to store
         reference we got from filling array
         */
        int[] mainArray = fillingArray.getMainArray();
        // Just an instantiation
        var iteratingArrayList = new IteratingArrayList();
        /**
         * Next line will call iterator from iterating array list class
         * and pass mainArray as an argument to it
         */
        int counter = iteratingArrayList.iterator(mainArray);

        // Just an instantiation
        var fillingEvens = new FillingOurEvenNumbersArray();
        /**
         * Next line will call filling evens method from filling evens
         * and pass mainArray and counter as an argument
         */
        fillingEvens.fillingEvens(mainArray,counter);
        /**
         * This calls the getEvenNumbers method from the fillingEvens object,
         * which is an instance of the FillingOurEvenNumbersArray class.
         * then store those data into int[] evenNumbers
         */
        int[] evenNumbers = fillingEvens.getEvenNumbers();

        var printOut = new PrintingOutOurEvenNumbers();
        printOut.printOutArray(evenNumbers);
    }
}