/**
 *  Implements the game of Craps logic.
 *
 *  @author  Audrey
 *  @version 9/20
 *  @author  Period: 6
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources: TODO collaborators
 */
public class CrapsGame
{
  private int point = 0;
  private CrapsGame game;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
    public int processRoll( int total )
    {
        int result = 0;

        if (point==0 && (total==7||total==11))
        {
            result= 1;
            point=0;
        }
        else
        {
            if (total ==7)
            {
                total=0;
                return -1;
            }   
            if (total==point)
            {
                total=0;
                return 1;
            }
            else
            {
                point=total;
                result=0;
            }
        }
        

        return result;
    }

    /**
     * Returns the saved point
     */
    public int getPoint()
    {
        return point;
    }
}