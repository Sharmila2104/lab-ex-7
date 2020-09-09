/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomvalue;
import java.util.ArrayList;


/**
 *
 * @author sharmila
 */
public class Randomvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList org = new ArrayList(); 
    ArrayList grtavg = new ArrayList();
    ArrayList lesavg = new ArrayList();
        int min = 10;
      int max = 90;
      int avg = 0;
        // adding elements and simultaneously finding average
         for (int j = 0; j<20; j++)
        {
        int pick =  (int) (Math.random() * (max - min + 1) + min); 
        org.add(pick);
        avg = avg+pick;
        
        }
        avg = avg/20;
System.out.println("Contents of original list: " + org);
System.out.println("The average is : "+ avg);
      // finding elements above average
       for (int j =0; j<20; j++ ){
         int a = (int) org.get(j);
         if(a>avg){
             grtavg.add(a);}
             
         else
          lesavg.add(a);
         }
         
System.out.println("\n \nContents of the main array: " + org);
System.out.println("\n \nContents greater than average: " + grtavg);
System.out.println("\n \nContents lesser than average: " + lesavg);
           
           
       } 
}