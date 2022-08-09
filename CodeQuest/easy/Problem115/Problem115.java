import java.util.*;

public class Problem115
{
    /* Problem 115: Animal Farm */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int i = 0; i < numTestCases; i++)
            {
                String[] info = scanner.nextLine().split(" ");
                int sum = 0;
                
                for(int j = 0; j < info.length; j++)
                {
                    if(j == 0)
                    {
                        sum += Integer.parseInt(info[j]) * 2;
                    }
                    else
                    {
                        sum += Integer.parseInt(info[j]) * 4;
                    }
                    
                }
                System.out.println(sum);
                
            }
        }
    }
}