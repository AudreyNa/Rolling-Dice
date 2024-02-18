// TODO comments

import java.io.Console;

public class DieTest
{
  public static void main(String[] args)
  {
    Die die1 = new Die();
    die1.roll();
    int value1 = die1.getNumDots();
    System.out.println(value1);

    Die die2 = new Die();
    die2.roll();
    int value2 = die1.getNumDots();
    System.out.println(value2);

    int total = value1+value2;
    System.out.println(total);
  }
}
