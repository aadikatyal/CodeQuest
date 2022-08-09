import java.util.*;

public class Problem
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String data = scanner.nextLine();
                int old = Integer.parseInt(data.substring(0,data.indexOf(" ")));
                int newd = Integer.parseInt(data.substring(data.indexOf(" ")+1));

                ArrayList<String> olddata = new ArrayList<String>();
                ArrayList<String> newdata = new ArrayList<String>();
                for(int i =0; i < old;i++)
                {
                    olddata.add(scanner.nextLine());
                }

                for(int i =0; i < newd;i++)
                {
                    newdata.add(scanner.nextLine());
                }

                List<String> oldNames = new ArrayList<String>();
                List<String> newNames = new ArrayList<String>();

                List<String> oldNums = new ArrayList<String>();
                List<String> newNums = new ArrayList<String>();

                List<String> oldAdd = new ArrayList<String>();
                List<String> newAdd = new ArrayList<String>();

                for(int i = 0; i < olddata.size();i++)
                {
                    oldNames.add(olddata.get(i).substring(0, olddata.get(i).indexOf(",")));
                }

                for(int i = 0; i < newdata.size();i++)
                {
                    newNames.add(newdata.get(i).substring(0, newdata.get(i).indexOf(",")));
                }

                for(int i = 0; i < olddata.size(); i++)
                {
                    String info = olddata.get(i);
                    info = info.substring(info.indexOf(",") + 1);
                    oldNums.add(info.substring(0, info.indexOf(",")));

                    info = info.substring(info.indexOf(",") + 1);
                    oldAdd.add(info);
                }

                for(int i = 0; i < newdata.size();i++)
                {
                    String info = newdata.get(i);
                    info = info.substring(info.indexOf(",") + 1);
                    newNums.add(info.substring(0, info.indexOf(",")));

                    info = info.substring(info.indexOf(",") + 1);
                    newAdd.add(info);
                }

                for(String oldName: oldNames)
                {
                    if(!newNames.contains(oldName))
                    {
                        System.out.println(oldName + " DELETED");
                    }
                }

                for(String newName: newNames)
                {
                    boolean addy = false;
                    boolean num = false;

                    if(!oldNames.contains(newName))
                    {
                        System.out.println(newName + " CREATED");
                    }
                    else if(oldNames.contains(newName))
                    {
                        for(String newNum: newNums)
                        {
                            if(!oldNums.contains(newNum))
                            {
                                num = true;
                                System.out.println(newName + " " + newNum);
                            }
                        }

                        for(String add: newAdd)
                        {
                            if(!oldAdd.contains(add))
                            {
                                addy = true;
                                System.out.println(newName + " " + add);
                            }
                        }

                        if(addy == true && num == true)
                        {
                            //System.out.println(newName + " UPDATED BOTH");
                        }
                        else if (num)
                        {
                            //System.out.println(newName + " UPDATED PHONE NUMBER");
                        }
                        else
                        {
                            //System.out.println(newName + " UPDATED ADDRESS");
                        }
                    }
                }
            }
        }
    }
}