import java.util.Scanner ;

 /*
  *  standard Algonquin header here
  */

 /**
  //   TODO 1 add Javadoc description for class here.
  */
 public class ButtonCounter
 {

     private int value;
     Scanner keyboard = new Scanner (System.in);
     //TODO 1: implement a method that gets the current value of this counter.\
    public ButtonCounter(int value){
        this.value = value ;
    }
     /**
      //TODO 2: Write Javadoc for the method function, parameters if any, and return data type if any.
      */
     public int getValue()
     {
    return value ;
     }
     public void setValue (int value){
         this.value = value ;
     }

     public int validator(){
         int result ;
         result = value - 3 ;
         System.out.print(result);
         return result ;

     }
     //TODO 3: implement a method that increments the current value of this counter by 3.
     /**

      //TODO 4: Write Javadoc for the method function, parameters if any, and return data type if any.
      */

     public void click()
     {

     }

     //TODO 5: implement a method that Resets the value of this counter to 0 and prints a message that the counter has been reset.
     /**
      //TODO 6: Write Javadoc for the method function, parameters if any, and return data type if any.
      */
     public void reset()
     {

     }


     //TODO 7: implement a method that Undoes a click, but prevents the tally from dropping below 0. If value goes below 0 it should show a message to the user information the condition.
     /**
      //TODO 8: Write Javadoc for the method function, parameters if any, and return data type if any.
      */
     public void undo()
     {

     }

 }

