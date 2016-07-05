// ICT373
// Assignement 1
// Task: Develop a console operated dating system
// This class is the main where we test the program
// M8 stands for Mate is the Name of the app.

/**
 * @author      Mike Gomes <mike@mikeios.com>
 * @version     1.0                 (current version number of program)
 * @since       12-April-2016          (the version of the package this class was first added to)
 */

package m8; //Included in the package m8

// import library to provide arraylist functionality
import java.util.ArrayList; 
import java.util.Iterator;

/**
 * Tests a matching partners algorithm.
 *
 * To try access with different users just uncomment the lines in the main.
 *
 * 
 */
public class M8 {

 /**
 * Main method, where we run the program    (1)
 * <p>
 * Attention! Important. Read the comments and uncomment lines to different outputs.    [2]
 * 
 * <p>
 * The program does not take keyboard input. 
 *
 * The program addresses all requirements of the tasks including those below.
 * 
 * The service manages a list of customers.
 * Customers have login (names) and passwords.
 * A customer is either an advertiser or a responder.
 * All customers also have some personal details including gender, age and income.
 * An advertiser has a text advert, a description of partner sought and a list of reply messages.
 * A description of partner sought has a gender, range of ages and range of incomes.
 * A reply message has an owner (which is a responder) and some text. 
 */
    public static void main(String[] args) {
        

        /**
        * Object of Type Student which will be used to print my detail on console
        */
        Student student = new Student();
        
        /**
        * ArrayList of strings that will hold love messages from the Responders
        */
        ArrayList<String> inbox = new ArrayList<String>();
        
        /**
        * ArrayList that holds a list of objects of the type Advertiser
        */
        ArrayList<Advertiser> listAdvertisers = new ArrayList<Advertiser>(); 
        
        /**
        * ArrayList that holds a list of Responders
        */
        ArrayList<Responder> listResponders = new ArrayList<Responder>();
        
        /**
        * ArrayList that holds a list of objects of the type Advertiser
        * in this case the advertisers which will be displayed to the Responder
        * in case of matching criteria
        */
        ArrayList<Advertiser> listMatched = new ArrayList<Advertiser>();
        ArrayList<Advertiser> listMatched2 = new ArrayList<Advertiser>();
        
        /**
        * Boolean variable that represents the state of a user in the system, 
        * where loggedIn false means that the user is not on the system
        */
        boolean loggedIn = false;
        
        /**
        * Created a object of Advertiser that will hold the current user
        */
        Advertiser currentUserAdv = new Advertiser(1, "", "", 'F', false, 1,1, "", inbox);
        
        /**
        * Created a object of Advertiser that will hold the current user
        */
        Responder currentUserRes = new Responder(1, "", "", 'M', false, 1, 1);
                        
        /**
        * Method that prints my student detail in the console using a student object
        */
        student.printStudentDetails();
        
        /**
        * print a user interface on the console
        */
        System.out.println("###############################################" + "\n");
        System.out.println("###          M8 Dating System             #####" + "\n");
        System.out.println("###############################################" + "\n");
        System.out.println("\n");
        System.out.println("Adding 4 new Advertisers and their partner sought.." + "\n");
        System.out.println("Done!" + "\n");        
        
        /**
        * Required. The service manages a list of customers.
        */
        System.out.println("a) create a list of 6-7 different customers of both types with made-up details built in to the client\n");
        
        /**
         * 
         * Required. An advertiser has a text advert, a description of partner sought and a list of reply messages.
         * Required. An advertiser has a text advert, a description of partner sought and a list of reply messages.
         * Required. Customers have login (names) and passwords.
         * When a customer is created in this the advertiser, the constructor
         * method assign those variables- ID, username, password,gender,paid,age, income, text advert, an empty inbox  
        */
        Advertiser adv1 = new Advertiser(123, "Marina", "test", 'F'  ,  true, 32,120000, "I am Mima"     , inbox);
        Advertiser adv2 = new Advertiser(1234, "Natalia","test", 'F', true, 32,120000, "I am Nati", inbox);
        Advertiser adv3 = new Advertiser(12345, "Nicole", "test", 'F', true, 32,120000, "I am Nici", inbox);
        Advertiser adv4 = new Advertiser(123456, "Sheila", "test", 'F', true, 32,120000, "I am Sheilinha", inbox);
       
        /**
         * Add advertisers to a list of all advertisers in the system
        */
        listAdvertisers.add(adv1);
        listAdvertisers.add(adv2);
        listAdvertisers.add(adv3);
        listAdvertisers.add(adv4);
         
        /**
        * Required. A description of partner sought has a gender, range of ages and range of incomes.
        * Every advertiser has a private object of type Description Sought
        * that has a method to set description of the desired match
        * The constructor object have 3 criteria, but in future it can be updated
        * Add Description Partner Sought have-Gender,min age, max age, min income , max income
        */             
        adv1.m_desiredPartner.setDesiredPartner('M', 23, 37, 50000, 140000);
        adv2.m_desiredPartner.setDesiredPartner('M', 32, 37, 50000, 150000);
        adv3.m_desiredPartner.setDesiredPartner('M', 30, 70, 50000, 160000);
        adv4.m_desiredPartner.setDesiredPartner('M', 30, 80, 50000, 170000);
                  
        System.out.println("\n");
        System.out.println("Adding 4 new Responders.." + "\n");
        System.out.println("Done!" + "\n");

        /**
        * Required.  A customer is either an advertiser or a responder.
        * Create a list of objects of type Responder which have in this constructor
        * ID number, username, password, gender, paid, age and income
        */
        Responder res1 = new Responder(113, "Luke", "test", 'M', true, 32, 120000);
        Responder res2 = new Responder(114, "John", "test", 'M', true, 32, 120000);
        Responder res3 = new Responder(112, "Mark", "test", 'M', true, 28, 160000);
        Responder res4 = new Responder(115, "Mathew", "test", 'M', true, 40, 40000);
           
        /**
        * Add responders to a list of all Responder custormers of system
        */
        listResponders.add(res1);
        listResponders.add(res2);
        listResponders.add(res3);
        listResponders.add(res4);  
            
        System.out.println("c) add a new customer to the dating service"+ "\n");       
    
        /**
        * c) add a new customer to the dating service
        * Add new cutomer to the system
        * Object type Responder, with ID, username, gender, isPaid, age, income
        */
        Responder res5 = new Responder(115, "Charlie", "test", 'M', true, 25, 120000);
        System.out.println(res5.getUserName()+ " age:"+ res5.getAge()+ " was added to the system." + "\n");
           
        /**
        * Add responders to a list
        */
        listResponders.add(res5);


        /**
        * List all Responders
        */
        System.out.println("e) display the details of all advertisers registered with the service" + "\n");
        
        /**
        * e) display the details of all advertisers registered with the service
        */
        currentUserAdv.printListAdvertisers(listAdvertisers);
            
        System.out.println("\n" + "List of all responders:" + "\n");

        System.out.println("f) display the details of all responders registered with the service" + "\n");
        
        /**
        * f) display the details of all responders registered with the service
        */
        currentUserRes.printListResponders(listResponders);
           
        System.out.println("\n");
            
        /**
        * Required. When new customers are created, i.e., when someone has paid and is
        * accepted, then they choose a new login and they are given their own default password
        * Get input username and password from user
        */
        
        /**
        * input a user name
        */
        String username = "Mark";
        
        /**
        * input a password
        */
        String password = "test";
            
        System.out.println("\n");
        
        System.out.println("System is loggin in..." + "\n");
        
        /**
        * Validate login
        */
        for (Iterator<Responder> it = listResponders.iterator(); it.hasNext(); ) 
        {
            Responder res = it.next();
            if (res.getUserName().equals(username)) 
            {
                if(password == res.getPassword())
                {
                    loggedIn = true;
                    currentUserRes.setUserId(res.getUserId());
                    currentUserRes.setUserName(res.getUserName());
                    currentUserRes.setGender(res.getGender());
                    currentUserRes.setAge(res.getAge());
                    currentUserRes.setIncome(res.getIncome());    
                } else 
                  {
                        System.out.println("Wrong password");
                  }
            } 
        } // End login validation
  
        System.out.println(currentUserRes.getUserName() + " is loggedIn");
        System.out.println("\n");
        // End login
            

       /**
        * Stores Get responder age to check matches
        */
       int responderAge = res2.getAge();
       
       /**
        * Stores Get responder income to check matches
        */
       double responderIncome = res2.getIncome();
       
       /**
        * Get responder gender to check matches
        */
       char responderGender = res2.getGender();
       
       System.out.println("b) get some matches for a responder...");
      
        /**
        * b) get some matches for a responder.
        * loop through all adversiters
        */
        for (int i=0; i<listAdvertisers.size();i++)
        {
           // for each advertirser get their description of partner sought 
           char desiredGender = listAdvertisers.get(i).getDesiredGender();
           int minDesiredAge = listAdvertisers.get(i).getDesiredMinAge();
           int maxDesiredAge = listAdvertisers.get(i).getDeridedMaxAge();
           double minDesiredIncome = listAdvertisers.get(i).getDesiredMinIncome();
           double maxDesiredIncome = listAdvertisers.get(i).getDesiredMaxIncome();
                   
           // Check if the responder logged in match de gender  
            if (responderGender == desiredGender)
            { 
                // check if gender responder match desired by advertiser
                if (responderAge >= minDesiredAge && responderAge <= maxDesiredAge)
                {
                    // check if income responder match desired by advertiser
                    if (responderIncome >= minDesiredIncome && responderIncome <= maxDesiredIncome)
                    {
                        //add adverstiser to a list o adversiters from a Responder
                        listMatched.add(listAdvertisers.get(i));                          
                    }                                      
                }
            } 
        }
       if (listMatched.size() == 0) // check if zero matches were found
            {
                System.out.println("Tough luck, no matches today");
            }// End checking responder matches 
               
       // Responder interface after login
       
       // Print greetings and username
       System.out.println( "\n");
       System.out.println("Logging in Responder....");
       
       System.out.println("###############################################");

       System.out.println( "Hello "+ res2.getUserName()+ "\n" ); 
       
        /**
        * counts number of matches that a Responder have
        */
       int totalMatches = 0;
       
        /**
        * Get size of ArrayList that contains advertisers from a responder
        */
       listMatched.size();
       
       // Print total of matches
       System.out.println("You have " + listMatched.size()  + " matches" ); 

       // Print list of all matches       
       System.out.println("\n" + "List of your matches" + "\n"); 
       
        /**
        * Check if list is not empty before print all matches on the console
        */
       if (listMatched.size() > 0) {

        /**
         * Loops thought the list and print matches on the console
         */
        for (int i=0; i<listMatched.size();i++)
            {
                System.out.println("##########  Match "+ i +"  ##########");
                String value = listMatched.get(i).getUserName();
                System.out.println(i +" - " + value);
            
                int age = listMatched.get(i).getAge();
                System.out.println("Age: " + age);
            
                value = listMatched.get(i).getTextAdvert();
                System.out.println("Text advert: " + value + "\n");  
            }// End listing responder matches
       
        }
        
       // Start process of sending message 
     
        /**
         * Get Responder name
         */
        String resName = res1.getUserName();
        
        System.out.println( "b) ...choose one match and send the match a message...");
        
        /**
         * Get responder input for choosing partner
         * The number is presented to the Responder in their user interfase(console)
         * b) ...choose one match and send the match a message...
         */
        int chosenPartner = 1;
        
        /**
         * This variables will hold 2 different text messages
         */
        String loveMessage = "I love you so much";
        String loveMessage2 = "Lets get married";
        
        System.out.println( "\n");
        System.out.println("Sending to messages from " + resName + " to " + listMatched.get(1).getUserName());
       
        System.out.println("###############################################" + "\n");
        // Send messages to partner chosen
        
        /**
         * Required.  *A reply message has an owner (which is a responder) and some text.
         * The Advertiser object listMatched will get a number chosen by the responder
         * which will be the owner and will add the message to an array of messages
         * of that chosen partner. 
         */ 
       listMatched.get(chosenPartner).addMessage(resName, loveMessage);
       listMatched.get(chosenPartner).addMessage(resName, loveMessage2);
        
      
        // Advertiser user interface after login  
        //b) then login that advertiser to get the message        
        System.out.println( "b)...then login that advertiser to get the message.");
        System.out.println( "\n");
        System.out.println("Logging in Avertiser...." + "\n");
       
         // Print user name on the console
        System.out.println("###############################################");
        System.out.println("\n" + "Hi " + listMatched.get(1).getUserName() + "\n" );
        
        System.out.println("##############################   INBOX   ################################");
        System.out.println( "\n");
        System.out.println("You have " + listMatched.get(1).m_inbox.size() + " messages");
        System.out.println( "\n");

        /**
         * List all messages in adverstiser inbox
         */
        listMatched.get(1).printInbox();
        System.out.println("#########################################################################");
        
        System.out.println("");
          
        // Delete message process

        /**
         * Input from user to choose message 
         */
        int chosenMessage = 1;
        
        /**
         * Delete chosen message
         */
        adv2.deleteMessage(chosenMessage);
        
        System.out.println("Deleting message " + chosenMessage + "..." + "\n");
        System.out.println("Done, deleted!" + "\n");
        System.out.println("Printing new INBOX" + "...");

        System.out.println("");
        System.out.println("###############################################");
        System.out.println("\n" + "Hi " + listMatched.get(1).getUserName() + "\n" );
        
        System.out.println("##############################   INBOX   ################################");
        System.out.println( "\n");
        System.out.println("You have " + listMatched.get(1).m_inbox.size() + " messages");
        System.out.println( "\n");
        
        /**
         * List all messages in adverstiser inbox
         */
        listMatched.get(1).printInbox();
        System.out.println("#########################################################################" + "\n");

        //d) delete an existing customer from the dating service
        System.out.println("d) delete an existing customer from the dating service" + "\n");
        
        //Remove customer process
       
        /**
         * Input user id to delete
         */
        int idToDelete = 113;
        
        /**
         * Delete chosen ID
         */
        for (Iterator<Responder> it = listResponders.iterator(); it.hasNext(); ) 
        {
            Responder res = it.next();
            if (res.getUserId() == idToDelete) 
            {
                it.remove();
                System.out.println("Deleting responder " + res.getUserName() + "...");
            }
        }// End delete user     
       
         System.out.println("\n" + "List of all responders after delete one:" + "\n");

            /**
             * List all Responders
            */
            for (int i=0; i<listResponders.size();i++)
            {
                String value = listResponders.get(i).getUserName();
                System.out.printf(value + "\n");  
            } 
            System.out.println("\n");
    }// end of main method
}// end of class m8
