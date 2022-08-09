import java.util.Scanner;

public class Problem78
{
    /* Problem 78: Are Eucliding Me */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String[] nums = scanner.nextLine().split(",");
                int num1 = Integer.parseInt(nums[0]), num2 = Integer.parseInt(nums[1]);

                int difference = Math.abs(num1 - num2);

                while(difference != 0)
                {
                    
                }

                if(num1 == num2 && num1 == 1)
                {
                    break;
                }
            }
        }
    }
}