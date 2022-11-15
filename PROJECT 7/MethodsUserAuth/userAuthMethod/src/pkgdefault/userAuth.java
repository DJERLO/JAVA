package pkgdefault;

import javax.swing.JOptionPane;

// PROJECT 7 - Methods (USER AUTHENTICATION)
//  NAME : JERLO F. DE LEON
//  COURSE & SECTION : CS_2C

public class userAuth {
    
    private static String username, password;
            static int attempts=3;
    
    
    public static void main(String[] args){

        loginForm();
        
    }

    private static void loginForm() {
        attempts = 3; 
        try{ 

            do {
                if (attempts > 0) {
                    username = JOptionPane.showInputDialog("You have Currently "+attempts+" Attempts\n"+"Enter Username");

                    //Is username null?
                    if(username==null){
                        System.exit(0); //Exit
                    }//If username not null get password and check
                    else {
                        password = JOptionPane.showInputDialog("Enter Password");

                        //is password null?
                        if(password==null){
                            System.exit(0); //Exit
                        }
                        //If username and password are not null do the authentication process
                        else if(username!=null && password != null) {
                            checkAuth(username, password);  //Declare my method
                        }

                    }
                }
                

            }while (attempts <=3 && attempts !=0);
            
               
            //If attempts == 0 message the user timeout!
            if(attempts==0){
                do{
                    JOptionPane.showMessageDialog(null,"Timeout!","userAuth",JOptionPane.ERROR_MESSAGE);
                    --attempts;
                }while(attempts==0);
            }
  
      }//Handling the Error
      catch(NullPointerException err){
            JOptionPane.showMessageDialog(null,err,"Message",JOptionPane.ERROR_MESSAGE);
        
        }
    
    
    }
    
    
    
    //Check Auth user Method
    private static void checkAuth(String username, String password) {
          
            
            if(username.equals("SDF")){
                if(password.equals("104")){
                        attempts = -1;
                        JOptionPane.showMessageDialog(null,"Access Granted!\n"
                        + "Welcome to SDF 104 Class","SDF104",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                }//If username correct but password wrong
                else{
                    attempts--;
                    JOptionPane.showMessageDialog(null,"Access Denied!\n"
                    + "Wrong Password\n","userAuth",JOptionPane.ERROR_MESSAGE);
                    
                }
            }//If Username and Paswword Wrong
            else if(!username.equals("SDF") && !password.equals("104")){
                attempts--;
                JOptionPane.showMessageDialog(null,"Access Denied!\n"
                + "Invalid Username or Password\n","userAuth",JOptionPane.ERROR_MESSAGE);
                
            }//If username is Invalid
            else{
                attempts--;
                JOptionPane.showMessageDialog(null,"Access Denied!\n"
                + "Invalid Username\n","userAuth",JOptionPane.ERROR_MESSAGE);
                
        }

    }
       
}

