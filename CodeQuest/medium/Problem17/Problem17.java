import java.util.Scanner;

public class Problem17
{
    /* Problem 17: Aerospace Intruders */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                int numShips = Integer.parseInt(scanner.nextLine());
                int min = Integer.MAX_VALUE;
                String hitName = "";

                for(int ship = 0; ship < numShips; ship++)
                {
                    String info = scanner.nextLine();
                    String shipName = info.substring(0, info.indexOf(":"));
                    String className = shipName.charAt(shipName.length() - 1) + "";
                    info = info.substring(info.indexOf(":") + 1);

                    int x = Integer.parseInt(info.substring(0, info.indexOf(",")));

                    /*
                    if(x < min)
                    {
                        min = x;
                        hitName = shipName;
                    }
                    */

                    //if(x != min)
                    {
                        if(className.equalsIgnoreCase("A"))
                        {
                            x -= ship + 10;
                        }
                        else if(className.equalsIgnoreCase("B"))
                        {
                            x -= ship + 20;
                        }
                        else
                        {
                            x -= ship + 30;
                        }
                    }

                    System.out.println(x + " " + shipName);
                }
            }
        }
    }
}