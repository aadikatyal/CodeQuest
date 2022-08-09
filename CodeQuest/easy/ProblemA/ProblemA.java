import java.util.Scanner;

public class ProblemA
{
    /* ProblemA: Hello World */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int i = 0; i < numTestCases; i++)
            {
                System.out.println(scanner.nextLine());
            }
        }
    }
}