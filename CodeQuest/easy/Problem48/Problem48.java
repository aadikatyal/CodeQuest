import java.util.*;

public class Problem48
{
    /* Problem 48: Batter Up */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String line = scanner.nextLine();
                String name = line.substring(0, line.indexOf(":"));
                line = line.substring(line.indexOf(":") + 1);

                String[] info = line.split(",");
                int atBats = 0, total = 0;

                for(int i = 0; i < info.length; i++)
                {
                    String current = info[i];

                    switch(info[i])
                    {
                        case "K":
                            atBats++;
                            break;
                        case "1B":
                            total++;
                            atBats++;
                            break;
                        case "2B":
                            total += 2;
                            atBats++;
                            break;
                        case "3B":
                            total += 3;
                            atBats++;
                            break;
                        case "HR":
                            total += 4;
                            atBats++;
                            break;
                        default:
                            break;
                    }
                }
                System.out.print(name + "=");
                System.out.format("%.3f", (double)total/atBats);
                System.out.println();
            }
        }
    }
}