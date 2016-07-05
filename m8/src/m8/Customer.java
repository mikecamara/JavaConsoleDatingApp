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

/**
 *
 * Class customer is the parent of the classes Advertiser and Customer
 */
public class Customer {
    
    /**
     * user id, unique identifier for users 
     */
    private int m_userId;
    
    /**
     * username, how user would like to be called
     */
    private String m_userName;
    
    /**
     * user password
     */
    private String m_password;
    
    /**
     * gender of the user 
     */
    private char m_gender;
    
    /**
     * boolean variable that is true if user has paid their fees
     */
    private boolean m_paid;
    
    /**
     * user age 
     */
    private int m_age;
    
    /**
     * user income
     */
    private double m_income;
     
    /**
     * six-argument constructor
     */
    public Customer(int userId, String userName, String password, char gender, 
                   boolean paid, int age, double income)
    {
        this.m_userId = userId;
        this.m_userName = userName;
        this.m_password = password;
        this.m_gender = gender;
        this.m_paid = paid;
        this.m_age = age;
        this.m_income = income;   
    }// end constructor
    
    /**
     * get user id
     */
    public int getUserId()
    {
        return m_userId;
    }
    
    /**
     * get username
     * @return username
     */
    public String getUserName()
    {
        return m_userName;
    }
    
    /**
     * get password
     * @return password
     */
    public String getPassword()
    {
        return m_password;
    }
    
    /**
     * get gender
     * @return gender
     */
    public char getGender()
    {
        return m_gender;
    }
    
    /**
     * Boolean that is true if user paid fees
     * @return isPaid
     */
    public boolean isPaid()
    {
        return m_paid;
    }
    
    /**
     * get user age
     * @return age
     */
    public int getAge()
    {
        return m_age;
    }
    
    /**
     * get user income
     * @return income
     */
    public double getIncome()
    {
        return m_income;
    }
    
    /**
     * set user id
     * @param userId
     */
    public void setUserId(int userId)
    {
        this.m_userId = userId;
    }
    
    /**
     * set username
     * @param username
     */
    public void setUserName(String username)
    {
        this.m_userName = username;
    }
    
    /**
     * set user password
     * @param password
     */
    public void setPassword(String password)
    {
        this.m_password = password;
    }
    
    /**
     * set user gender
     * @param gender
     */
    public void setGender(char gender)
    {
        this.m_gender = gender;
    }
    
    /**
     * set boolean true is user paid fees
     * @param paid
     */
    public void setIsPaid(boolean paid)
    {
        this.m_paid = paid;
    }
    
    /**
     * set user age
     * @param age
     */
    public void setAge(int age)
    {
        this.m_age = age;
    }
    
    /**
     * set user income
     * @param income
     */
    public void setIncome(double income)
    {
        this.m_income = income;
    }
      
}//end of class Customer
