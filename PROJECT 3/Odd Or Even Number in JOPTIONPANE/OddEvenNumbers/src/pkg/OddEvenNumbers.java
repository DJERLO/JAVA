package pkg;

import javax.swing.JOptionPane;

// PROJECT 3 - ODD OR EVEN NUMBER USING JOPTIONPANE
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C

public class OddEvenNumbers {

    public static void main(String[] args) {
       String Number = JOptionPane.showInputDialog("Enter the Number");
       
       int num = Integer.parseInt(Number);
       
       isItEven(num); // Called Method isItEven
    }
    
//user Predefine Method
    public static void isItEven(int num){
        
        if(num % 2 == 0){
        JOptionPane.showMessageDialog(null, num+" is an Even number", "Result", JOptionPane.PLAIN_MESSAGE);}
        else{
        JOptionPane.showMessageDialog(null, num+" is an Odd number", "Result", JOptionPane.PLAIN_MESSAGE);}
    
    }
}
