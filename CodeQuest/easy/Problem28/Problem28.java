import java.util.*;

public class Problem28
{
    /* Problem 28: Anagram Checker */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String currentLine = scanner.nextLine();
                String[] words = currentLine.split("\\|");
                String scrambled = words[0], unscrambled = words[1];

                Map<Character, Integer> scrambledMap = getMap(scrambled), unscrambledMap = getMap(unscrambled);

                if(scrambledMap.equals(unscrambledMap) && !scrambled.equals(unscrambled))
                {
                    System.out.println(currentLine + " = ANAGRAM");
                }
                else
                {
                    System.out.println(currentLine + " = NOT AN ANAGRAM");
                }
            }
        }
    }

    public static Map<Character, Integer> getMap(String word)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c: word.toCharArray())
        {
            Integer count = map.get(c);
            if(count == null)
            {
                count = 0;
            }
            count++;
            map.put(c, count);
        }

        return map;
    }
}