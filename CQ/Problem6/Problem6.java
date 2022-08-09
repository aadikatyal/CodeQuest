import java.util.*;

public class Problem6
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                int numExpected = Integer.parseInt(scanner.nextLine());
                String[] nums = scanner.nextLine().split(" ");

                List<String> list = new ArrayList<>();
                for(int i = 1; i <= numExpected; i++)
                {
                    list.add(i + "");
                }

                List<String> list2 = new ArrayList<>();

                for(int i = 0; i < nums.length; i++)
                {
                    list2.add(nums[i]);
                }

                for(int i = 0; i < list.size(); i++)
                {
                    if(!list2.contains(list.get(i)))
                    {
                        System.out.println(list.get(i));
                    }
                }
            }
        }
    }
}