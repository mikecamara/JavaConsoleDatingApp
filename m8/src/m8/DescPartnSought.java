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
 * @author mcmikecamara
 *//**
 *
 * Class DescPartnSought is a class that will be used as an object of the Advertiser
 * and will hold all the requirements of the advertiser for their choice of soulmate
 */
public class DescPartnSought {
    
    /**
     * desired partner gender 
     */
    private char m_desiredGender;
    
    /**
     * desired partner minimum age 
     */
    private int m_desiredMinAge;
    
    /**
     * desired partner Maximum age 
     */
    private int m_desiredMaxAge;
    
    /**
     * desired partner minimum income 
     */
    private double m_desiredMinIncome;
    
    /**
     * desired partner maximum income 
     */
    private double m_desiredMaxIncome;
    
    /**
     * Constructors that take no parameters
     */
    public DescPartnSought(){}
   
    /**
     * Get desired partner gender
     * @return desiredGender
     */
    public char getDesiredGender()
    {
       return m_desiredGender;
    }
   
   /**
     * Set desired partner gender
     * @param gender
     */
   public void setDesiredGender(char gender)
   {
       m_desiredGender = gender;
   }
   
   /**
     * Get desired partner minimum age
     * @return desired minimum age
     */
   public int getDesiredMinAge()
   {
       return m_desiredMinAge;
   }
   
   /**
     * Set desired partner min age
     * @param minAge
     */
   public void setDesiredMinAge(int age)
   {
       m_desiredMinAge = age;
   }
   
   /**
     * Get desired partner maximum age
     * @return desired partner maximum age
     */
   public int getDesiredMaxAge()
   {
       return m_desiredMaxAge;
   }
   
   /**
     * Set desired partner max age
     * @param maxAge
     */
   public void setDesiredMaxAge(int age)
   {
       m_desiredMaxAge = age;
   }
   /**
     * Get desired partner income
     * @return partner income
     */
   public double getDesiredMinIncome()
   {
       return m_desiredMinIncome;
   }
   
   /**
     * Set desired partner min income
     * @param minIncome
     */
   public void setDesiredMinIncome(double minIncome)
   {
       m_desiredMinIncome = minIncome;
   }
   
   /**
     * Get desired partner max income
     * @return maximum income
     */
   public double getDesiredMaxIncome()
   {
       return m_desiredMaxIncome;
   }
   
   /**
     * Set desired partner income
     * @param maxIncome
     */
   public void setDesiredMaxIncome(double maxIncome)
   {
       m_desiredMaxIncome = maxIncome;
   }
   
   /**
     * Set Desired partner
     * @param gender, minAge, maxAge, minIncome, maxIncome
     */
   public void setDesiredPartner(char gender, int minAge, int maxAge, double minIncome, double maxIncome)
    {
        m_desiredGender= gender;
        m_desiredMinAge = minAge;
        m_desiredMaxAge = maxAge;
        m_desiredMinIncome = minIncome;
        m_desiredMaxIncome = maxIncome;
    }
 
}// End class DescPartnSought
