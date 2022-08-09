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
                //String[] nums = scanner.nextLine().split(" ");

                int[] nums = Arrays.stream(scanner.nextLine().split(" "))..mapToInt(Integer::parseInt).toArray();
                int num1 = nums[0];
                int num2 = nums[1];

                System.out.println(num1 + num2 + " " + num1 * num2);
            }
        }
    }
}