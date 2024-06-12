 /*
  *  standard Algonquin header here
  */

 /**
  //    TODO 1 add Javadoc description for class here.
  */
 public class ButtonCounterTester
 {
     public static void main(String[] args)
     {
         ButtonCounter tally = new ButtonCounter();
         tally.click();
         tally.click();
         tally.click();
         System.out.println(tally.getValue());
         System.out.println("Expected: 9");
         tally.undo();
         System.out.println(tally.getValue());
         System.out.println("Expected: 6");
         tally.undo();
         tally.undo();
         tally.undo();
         System.out.println(tally.getValue());
         System.out.println("Expected: 0");
     }
 }
