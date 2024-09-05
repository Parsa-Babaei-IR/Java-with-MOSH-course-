public class FillingOurEvenNumbersArray {
    IteratingArrayList iteratingArrayList = new IteratingArrayList() ;
    public int [] evenNumbers ;
    public void fillingEvens(int[] mainArray , int counter ){
        evenNumbers = new int [counter] ;
        int index = 0 ;
        for (int num : mainArray){
            if (num % 2 == 0){

                evenNumbers[index] = num ;
                index += 1 ;
            }

        }

        }
        public int[] getEvenNumbers(){
            return evenNumbers ;
        }
    }

