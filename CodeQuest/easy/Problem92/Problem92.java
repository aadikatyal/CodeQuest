import java.util.*;

public class Problem92
{
    /* Problem 92: Caught Speeding */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int i = 0; i < numTestCases; i++)
            {
                String[] info = scanner.nextLine().split(" ");
                int speed = Integer.parseInt(info[0]);

                if(Boolean.parseBoolean(info[1]))
                {
                    speed -= 5;
                }

                if(speed <= 60)
                {
                    System.out.println("No Ticket");
                }
                else if(speed > 60 && speed <= 80)
                {
                    System.out.println("Small Ticket");
                }
                else
                {
                    System.out.println("Big Ticket");
                }
            }
        }
    }
}
