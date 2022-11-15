package tax;

import javax.swing.JOptionPane;
// PROJECT 4 - IF ELSE TAX
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C

public class IFELSETAX {
    
    public static void main(String[] args) {
       
        String workingDays = JOptionPane.showInputDialog(null,"Eneter your Working Days");
        String ratePerDay = JOptionPane.showInputDialog(null,"Eneter your Working Days");
        
        int wD = Integer.parseInt(workingDays);
        int rPD = Integer.parseInt(ratePerDay);
        
        int salary = wD * rPD;
        
        if (salary >= 5000) {
            JOptionPane.showMessageDialog(null,"Your Salary is "+ salary+"\nThis is Taxable","Paycut",-1);
        }else {
            JOptionPane.showMessageDialog(null,"Your Salary is "+ salary+"\nThis is not Taxable","Paycut",-1);
        }

    }
    
}
