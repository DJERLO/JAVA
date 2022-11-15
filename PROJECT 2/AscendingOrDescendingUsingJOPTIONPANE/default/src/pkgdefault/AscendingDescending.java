
package pkgdefault;



// PROJECT 2 - Ascending Or Descending in JOPTIONPANE
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class AscendingDescending {

    public static void main(String[] args) {
    
    ArrayList<Integer> numinput = new ArrayList<Integer>();
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        numinput.add(a);
    int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        numinput.add(b);
    int c = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number"));
        numinput.add(c);
    
    int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Type [1]- Ascending Order or [2] Descending Order","What Do you want Todo?",JOptionPane.QUESTION_MESSAGE));

    switch(choice){
    //Ascending Order
        case 1:
            Collections.sort(numinput);
            JOptionPane.showMessageDialog(null,
                    "Numbers entered by user are listed in ascending order.\n"+
                    numinput,
                    "Ascending Order",
                    JOptionPane.INFORMATION_MESSAGE);
            break;
        
    //Descending Order
        case 2:    
            
            Collections.sort(numinput, Collections.reverseOrder());
            JOptionPane.showMessageDialog(null,
                    "Numbers entered by user are listed in descending order. \n"+
                    numinput,
                    "Descending Order",
                    JOptionPane.INFORMATION_MESSAGE);
            break;
    
        }
    }
}