import java.util.Scanner ;
class FillingArray {
    /** First we need to create an empty array*/
    /**Initialize our array list , type is Int
     */
    private int mainArray[] ;
    /** Now i instantiate our Scanner */
    Scanner scanner = new Scanner(System.in);

    /** Now we need a method to get a range of
     * main array I call this method "arrayOperation"
     */
    public void arrayOperation(int range){
        mainArray = new int[range] ;
       // scanner = new Scanner(System.in) ;
    }

    /** Next class will get the input from the user
     * and then fill the class
     */
    public void filingArray(){
        for (int i = 0 ; i < mainArray.length ;i++){
            System.out.printf("Enter the %d st number in your list.",i);
            mainArray[i] = scanner.nextInt();
        }
    }
    /**Right now I need a getMainArray method
     * because I would like to pass our array to other classes
     */
    public int[] getMainArray(){
        return (mainArray);
    }


}
