import java.util.*;

public class Problem3
{
    /* Problem 3: Autocorrect */

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String[] info = scanner.nextLine().split(" ");
                int numDictWords = Integer.parseInt(info[0]);
                int numMissWords = Integer.parseInt(info[1]);

                List<String> dictWords = new ArrayList<>();

                for(int i = 0; i < numDictWords; i++)
                {
                    dictWords.add(scanner.nextLine());
                }

                

                for(int i = 0; i < numMissWords; i++)
                {
                    String missWord = scanner.nextLine();
                    //System.out.println(missWord);

                    Map<String, Integer> map = new HashMap<>();

                    for(String dictWord: dictWords)
                    {
                        int count = 0;
                        System.out.println(missWord);
                        if(dictWord.length() != missWord.length())
                        {
                            break;
                        }

                        

                        for(int j = 0; j < missWord.length(); j++)
                        {
                            if((missWord.charAt(j) + "").equals(dictWord.charAt(j) + ""))
                            {
                                count++;
                            }
                        }
                        map.put(dictWord, count);
                    }

                    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
                    int min = Integer.MAX_VALUE;

                    while(iterator.hasNext())
                    {
                        Map.Entry<String, Integer> mapInfo = iterator.next();
                        String key = mapInfo.getKey();
                        int val = mapInfo.getValue();

                        if(val < min)
                        {
                            min = val;
                        }
                    }

                    //System.out.println(map);
                }
            }
        }
    }
}