import java.util.*;

public class Problem67
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int i = 0; i < numTestCases; i++)
            {
                String line = scanner.nextLine();
                int vowelCounter = 0;

                for(Character c: line.toCharArray())
                {
                    switch(Character.toLowerCase(c))
                    {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowelCounter++;
                            break;
                    }
                }

                System.out.println(vowelCounter);
            }
        }
    }
}