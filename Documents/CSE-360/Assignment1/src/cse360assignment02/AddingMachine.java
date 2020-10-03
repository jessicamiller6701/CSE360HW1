/** <h1>Author Information</h1>
 *  Name: Jessica Miller
 *  ASU ID: 1214708170
 *  Email: jtmill25@asu.edu
 *  Date Edited: 10/03/2020
 */
/** <h1>Program Description</h1>
 *  This program has little functionality at this point, all that is happening is an
 *  addition of comments and practice with version control.
 */

package cse360assignment02; //inherits from package cse360assignment02

/**
 * This public class is being called AddingMachine
 */
public class AddingMachine
{
    /**
     * Variables and StringBuffer being declared
     */
    private int total;
    StringBuffer history;

    /**
     * calling method AddingMachine
     * using to set total to 0, and the stringbuffer history to 0
     */
    public AddingMachine ()
    {
        total = 0;
        history = new StringBuffer("0");
    }

    /**
     * calling method getTotal
     * returns current value of var total
     */

    public int getTotal ()
    {
        return total;
    }

    /**
     * calling method add
     * takes value as parameter and modifies accordingly for the command ".add"
     * appends the stringbuffer as is appropriate
     */

    public void add (int value)
    {
        total = total + value;
        history.append(" + "+value);
    }

    /**
     * calling method subtract
     * takes value as parameter and modifies accordingly for the command ".sub"
     *
     */

    public void subtract (int value)
    {
        total = total - value;
        history.append(" - "+value);
    }

    /**
     * calling method String as a toString method
     * returns the history and what has been appended
     */

    public String toString ()
    {
        return history.toString();
    }

    /**
     * calling method clear
     * no content at the moment
     */

    public void clear()
    {
    }
}

/** <h1>Resources</h1>
 * https://idratherbewriting.com/java-share-files/
 */
