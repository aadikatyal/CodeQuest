import java.util.*;

public class Problem3
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String[] text = scanner.nextLine().split(" ");

                int numListed = Integer.parseInt(text[0]);
                int numReported = Integer.parseInt(text[1]);

                List<String> list = new ArrayList<>();

                for(int i = 0; i < numListed; i++)
                {
                    list.add(scanner.nextLine());
                }

                for(int i = 0; i < numReported; i++)
                {
                    list.remove(scanner.nextLine());
                }

                Collections.sort(list);

                for(String item: list)
                {
                    System.out.println(item);
                }
            }
        }
    }
}