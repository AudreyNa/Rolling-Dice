/**
 *  Simulates a six-sided die.
 *
 *  @author  Audrey
 *  @version 9/20
 *  @author  Period: 5
 *  @author  Assignment: JMCh07_RollingDice
 *
 */


public class Die
{
    private int numDots;

    /**
     * Sets numDots to a random integer from 1 to 6
     */
    public void roll()
    {
        numDots = (int)(Math.random()*6)+1;
    }
    
    /**
     * Returns the value of the most recent roll.
     * @return numDots
     */
    public int getNumDots()
    {
        return numDots; 
    }
}
