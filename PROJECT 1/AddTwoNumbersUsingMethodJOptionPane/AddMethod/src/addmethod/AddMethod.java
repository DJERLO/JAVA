package addmethod;

import javax.swing.JOptionPane;

// PROJECT 1 - ADD TWO NUMBERS IN JOPTIONPANE with Methods
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C

public class AddMethod {

    public static void main(String[] args) {
       
        String num1, num2;
        int x, y, ans;
       
       num1 = JOptionPane.showInputDialog(null, "Enter First Number", "AddMethod",JOptionPane.PLAIN_MESSAGE);
       num2 = JOptionPane.showInputDialog(null, "Enter Second Number", "AddMethod",JOptionPane.PLAIN_MESSAGE);
       
       x = Integer.parseInt(num1);
       y = Integer.parseInt(num2);
    
       ans = add(x, y);
       JOptionPane.showMessageDialog(null, "The Sum of x and y is:\t "+ans, "AddMethod", JOptionPane.PLAIN_MESSAGE);
    
    }
    
    //Create Predefine Method
    public static int add(int a, int b){
    
        int ans = a + b;
        return ans;
    
    }
}
