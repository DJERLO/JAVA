
package addintmethod;

import javax.swing.JOptionPane;

// PROJECT 1 - ADD TWO NUMBERS IN JOPTIONPANE
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C


public class AddIntMethod {

    public static void main(String[] args) {
        
        String firstnum = JOptionPane.showInputDialog("Enter first number");
        String secondnum = JOptionPane.showInputDialog("Enter second number");
        
        int x = Integer.parseInt(firstnum);
        int y = Integer.parseInt(secondnum);
        
        int c = add(x, y);
        
        JOptionPane.showMessageDialog(null, "The Sum of " +x+ " and "+ y +" is "+c,"AddIntMethod", JOptionPane.PLAIN_MESSAGE);
        
    }
    
    public static int add(int n1, int n2){
    int s;
    
    s = n1+n2;
    
    return s;
                
    }
}
