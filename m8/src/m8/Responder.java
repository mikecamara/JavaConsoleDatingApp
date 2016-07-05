// ICT373
// Assignement 1
// Task: Develop a console operated dating system
// This class is the main where we test the program
// M8 stands for Mate is the Name of the app.

/**
 * @author      Mike Gomes <mike@mikeios.com>
 * @version     1.0                 (current version number of program)
 * @since       12-April-2016       (the version of the package this class was first added to)
 */
package m8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * Class Responder inherits from Customer
 * so it extends the methods form Customer like getName()
 */
public class Responder extends Customer {
    
    /**
     * String to hold text message 
     */
    private String m_msg;
    
    /**
     * int that holds a number that represents the Advertiser that the responder
     * will send a message
     */
    private int m_favMatch;
    
    /**
     * Holds state of user in the system if true so user is logged in 
     */
    private boolean m_isLoggedin;
    

    /**
     * 7 argument constructor
     * (subclass) constructor that calls the superclass constructor and then adds initialization code of its own
     */
    public Responder(int userId, String userName, String password, char gender, 
            boolean paid, int age, double income)
    {
            // Call the super class Customer which holds those private variables
            super(userId, userName, password, gender, paid, age, income);
           
    }
    
    
    /**
     * Method to send message to Advertisers
     * @param number that holds advertiser and string that holds a message
     */
    public void sendMessage(int favMatch, String msg)
    {
       m_favMatch = favMatch;
       m_msg = msg;
    }
   
    /**
     * Method to print list of Responder
     * @param ArrayList of Responder
     */
    public void printListResponders(ArrayList<Responder> listRes)
    {
        for (int i=0; i<listRes.size();i++)
        {
            String value = listRes.get(i).getUserName();
            System.out.printf(value + "\n");  
        } 
    }
   
    /**
     * set state of user in the system, if true user is logged in 
     */
    public void setIsLoggedIn(boolean islogged)
    {
      m_isLoggedin = islogged; 
    }
          
}// end of Responder class
