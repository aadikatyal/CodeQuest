import java.util.Scanner;

public class Problem44
{
    /* Problem 44: Addiply */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int i = 0; i < numTestCases; i++)
            {
                String[] nums = scanner.nextLine().split(" ");
                int num1 = Integer.parseInt(nums[0]);
                int num2 = Integer.parseInt(nums[1]);

                System.out.println(num1 + num2 + " " + num1 * num2);
            }
        }
    }
}