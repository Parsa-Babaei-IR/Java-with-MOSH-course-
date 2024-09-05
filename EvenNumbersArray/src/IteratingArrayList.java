public class IteratingArrayList {
    public int iterator(int[] mainArray){
        int index = 0 ;
        int counter = 0 ;
        for (int num : mainArray){
            index += 1 ;
            if ( num % 2 == 0 ){
                counter += 1 ;
            }
            System.out.printf("your %d st element is %d",index,num);
        }
        System.out.println(" ");
        return (counter);
    }



}
