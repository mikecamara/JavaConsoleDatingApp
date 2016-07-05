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
 * Class Advertiser inherits from Customer
 * so it extends the methods form Customer like getName()
 */
public class Advertiser extends Customer{
    
    /**
     * String to hold text advertising 
     */
    private String m_textAdvert;
    
    /**
     * A message is a String 
     */
    private String m_message;
   
    /**
     * This holds an array of Strings that are the messages from the Responders
     * in the future think about creating a class Message
     */
    ArrayList<String> m_inbox = new ArrayList<String>();
    
    /**
     * Creates an object of the Type DescPartnSought
     * that will be set according to the preferences of the Advertiser
     */
    DescPartnSought m_desiredPartner = new DescPartnSought();
    
    
    /**
     * 7 argument constructor
     * (subclass) constructor that calls the superclass constructor and then adds initialization code of its own
     */
    public Advertiser(int userId, String userName, String password, char gender, 
            boolean paid, int age, double income, String textAdvert,  ArrayList<String> inbox)
    {
            // Call the super class Customer which holds those private variables
            super(userId, userName, password, gender, paid, age, income);
    
            this.m_textAdvert = textAdvert;
            this.m_inbox = inbox;
    }
    
    /**
     * Get text advert method returns a text advert
     */
    public String getTextAdvert()
    {
        return m_textAdvert;
    }
    
    /**
     * set text advert method 
     */
    public void setTextAdvert(String textAdvert)
    {
        this.m_textAdvert = textAdvert;
    }
    
    /**
     * Set desired gender
     */
    public void setDesiredGender(char gender)
    {
        m_desiredPartner.setDesiredGender(gender);
    }
    
    /**
     * Set desired minimum age
     */
    public void setDesiredMinAge(int age)
    {
        m_desiredPartner.setDesiredMinAge(age);
    }
    
    /**
     * Set desired max age
     */
    public void setDesiredMaxAge(int age)
    {
        m_desiredPartner.setDesiredMaxAge(age);
    }
    
    /**
     * set desired min income
     */
    public void setDesiredMinIncome(double minIncome)
    {
        m_desiredPartner.setDesiredMinIncome(minIncome);
    }
    
    /**
     * set desired max income
     */
    public void setDesiredMaxIncome(double maxIncome)
    {
        m_desiredPartner.setDesiredMaxIncome(maxIncome);
    }
    
    /**
     * Get desired gender 
     */
    public char getDesiredGender()
    {
        return m_desiredPartner.getDesiredGender();
    }
    
    /**
     * Get desired minimum age
     */
    public int getDesiredMinAge()
    {
        return m_desiredPartner.getDesiredMinAge();
    }
    
    /**
     * Get desired max age
     */
    public int getDeridedMaxAge()
    {
        return m_desiredPartner.getDesiredMaxAge();
    }
    
    /**
     * Get desired min income
     */
    public double getDesiredMinIncome()
    {
        return m_desiredPartner.getDesiredMinIncome();
    }
    
    /**
     * Get desired max income
     */
    public double getDesiredMaxIncome()
    {
        return m_desiredPartner.getDesiredMaxIncome();
    }
    
    /**
     * Method to add messages to the Advertiser Inbox(ArrayList of strings)
     * it have a Responder name(owner) and a message
     * @param responder
     * @param message
     * 
     */
    public void addMessage(String resName, String message)
    {
        String msg = resName + " said - " + message;
        m_inbox.add(msg);
    }
    
    /**
     * This method deletes a message of an Inbox taking a number as a parameter
     * @param index 
     */
    public void deleteMessage(int index)
    {
         m_inbox.remove(index);
    
    }
    
    /**
     * Get message
     * @return message
     */
    public String getMessage()
    {
        return m_message;
    }
    
    /**
     * Loops arrayList ot messages and print them on the console
     */
    public void printInbox()
    {
        for (int i=0; i<m_inbox.size();i++)
       {
           
            String value = m_inbox.toString();
            System.out.printf(value + "\n");  
       }
    }
    
    /**
     * Takes a list of Advertiser as a parameter, loop throught and print all on console
     * @param Advertiser
     */
    public void printListAdvertisers(ArrayList<Advertiser> listAdv)
    {
        for (int i=0; i<listAdv.size();i++)
        {
            String value = listAdv.get(i).getUserName();
            System.out.printf(value + "\n");  
        } 
    }  
    
}// end class Advertiser
