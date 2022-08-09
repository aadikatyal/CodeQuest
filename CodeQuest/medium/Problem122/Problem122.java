import java.util.Scanner;

public class Problem122
{
    /* Problem 122: Divide by Zero */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String[] nums = scanner.nextLine().split(" ");

                double num1 = 0, num2 = 0;
                boolean canEvaluate = true;

                try
                {
                    num1 = Double.parseDouble(nums[0]);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Dividend");
                    canEvaluate = !canEvaluate;
                }

                try
                {
                    num2 = Double.parseDouble(nums[1]);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Divisor");
                    canEvaluate = !canEvaluate;
                }

                if(canEvaluate)
                {
                    if(num2 == 0)
                    {
                        System.out.println("Divide By Zero");
                    }
                    else
                    {
                        System.out.println(num1 / num2);
                    }
                }
            }
        }
        
    }
}