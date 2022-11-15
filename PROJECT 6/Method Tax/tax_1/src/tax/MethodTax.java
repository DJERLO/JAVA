package tax;

import javax.swing.JOptionPane;

// PROJECT 6 - Get TAX using Method
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C

public class MethodTax {
    
    public static void main(String[] args) {
       
        String workingDays = JOptionPane.showInputDialog(null,"Eneter your Working Days");
        String ratePerDay = JOptionPane.showInputDialog(null,"Eneter your Working Days");
        
        int wD = Integer.parseInt(workingDays);
        int rPD = Integer.parseInt(ratePerDay);
        
        int salary = getSalary(wD,rPD); // Method
        
        if (salary >= 5000) {
            JOptionPane.showMessageDialog(null,"Your Salary is "+ salary+"\nThis is Taxable","Paycut",-1);
        }else {
            JOptionPane.showMessageDialog(null,"Your Salary is "+ salary+"\nThis is Taxable","Paycut",-1);
        }
        
        
        
    }
    //User Method
    private static int getSalary(int workingDays, int rate) {
        
        int salary = workingDays*rate;
    
        return salary;
    
    
    }
    
}
