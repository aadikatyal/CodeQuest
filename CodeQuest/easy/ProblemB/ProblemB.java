import java.util.Scanner;

public class ProblemB
{
    /* Problem B: Not So Self-Driving */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int i = 0; i < numTestCases; i++)
            {
                String[] info = scanner.nextLine().split(":");
                double speed = Double.parseDouble(info[0]);
                double distance = Double.parseDouble(info[1]);
                
                if(distance <= speed)
                {
                    System.out.println("SWERVE");
                }
                else if((distance / speed) <= 5)
                {
                    System.out.println("BREAK");
                }
                else
                {
                    System.out.println("SAFE");
                }
            }
        }
    }
}