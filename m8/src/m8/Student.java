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

// Libraries imported to be able to print current date on console
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * Class Student is used uniquely to print my details as a student on the main program
 */
public class Student {
     
    /**
    *
    * Get current date time with Calendar()
    */
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");   
    Calendar cal = Calendar.getInstance();
    
    /**
    *
    * Method to print my details as a student and date on the console
    */
    public void printStudentDetails()
    {
        System.out.println("Student: Mike Gomes Camara" + "\n" + "ID: 32783992" + "\n" +
                           "Mode enrolment: Internal" + "\n" + "Tutor names: Ferdous and Rob" + "\n" +
                           "Today is: " +  dateFormat.format(cal.getTime()) + "\n" );
    }
    
} // End class Student
