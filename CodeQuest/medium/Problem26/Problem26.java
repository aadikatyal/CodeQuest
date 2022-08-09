import java.util.Scanner;

public class Problem26
{
    /* Problem 26: Change for the World */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                double amount = Double.parseDouble(scanner.nextLine().substring(1));
                System.out.println("$" + String.format("%.2f", amount));

                int numQ = 0, numD = 0, numN = 0, numP = 0;

                numQ = (int) (amount / 0.25);
                amount %= 0.25;
                
                numD = (int) (amount / 0.10);
                amount %= 0.10;

                numN = (int) (amount / 0.05);
                amount %= 0.05;

                numP = (int) (amount / 0.01);
                amount %= 0.01;

                System.out.println("Quarters=" + numQ + "\nDimes=" + numD + "\nNickels=" + numN + "\nPennies=" + numP);
            }
        }
        
    }
}