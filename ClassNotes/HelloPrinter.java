
/**
 * Every Java program contains one or more classes (e.g. HelloPrinter)
 * 
 * In general, every source file (HelloPrinter.java) contains one class (HelloPrinter)
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 * 
 * @author Mr. Callaghan 
 * @version 21 Aug 2018
 */

public class HelloPrinter
{
    /**
     * A class contains methods.
     * 
     * Every Java application contains a class with a main method.
     * 
     * THe main method is executed when the application starts.
     */
    public static void main(String[] args )
    {
        /**
         * A method contains statements.
         * 
         * Statements can envoke other methods (e.g. println).
         * 
         * In general, methods are invoked on objects (e.g. System.out).
         * 
         * When invoking a mehtod, arguments are passed in paratheses (e.g. "Hello, World!")
         */

        System.out.println("Hello, World!");  // comment at the end of a line

        // this is a single-line comment (like # in python)

        /**
         * Identifiers are any combination of:
         *      letters
         *      digits(but not the first character)
         *      underscores
         *      dollar signs
         *      
         *      These are various identifiers:
         */

        int y, x2, x_x, x$;

        // This is not a valid identifier:
        //int 2y;

        /**
         * Identifiers are case sensitive (case matters).
         * 
         * These are 3 different identifiers:
         */
        String box, BOX, Box;
        
        /**
         * By convention, constants are all uppercase.
         *      Use underscores to separate words
         */
        
        int SPEED_OF_LIGHT = 3000000000;
        
        /**
         * by convention, all other identifiers start with lowercase letter.
         *      Subsequent words will start with a capital letter. (CamalCase)
         */
        
        String firstName;
        
        
        
        
        
        
        
        
        
        
        

    }
}

