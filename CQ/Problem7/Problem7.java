import java.util.*;
import java.text.DecimalFormat;

public class Problem7
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numTestCases = Integer.parseInt(scanner.nextLine());

            for(int testCase = 0; testCase < numTestCases; testCase++)
            {
                String[] info = scanner.nextLine().split(" ");

                int diameter = Integer.parseInt(info[0]);
                int reqRev = Integer.parseInt(info[1]);
                int powerReq = Integer.parseInt(info[2]);
                int speed = Integer.parseInt(info[3]);

                //check if equal to this
                int capacity = Integer.parseInt(info[4]);

                int voltage = Integer.parseInt(info[5]);
                int distance = Integer.parseInt(info[6]);

                double C = Math.PI * diameter;
                double rotations = (distance * 100) / C;
                double revolutions = rotations * reqRev;
                double time = revolutions / 10;

                double power = revolutions * powerReq;

                double current = 0.0;

                if(voltage != 0)
                {
                    current = power / voltage;
                }
                
                double energy = current * time;

                double energy2 = energy / 60;

                if(energy2 <= capacity)
                {
                    DecimalFormat d = new DecimalFormat("#.####");
                    System.out.println("Success " + d.format(time));
                }
                else
                {
                    System.out.println("Fail");
                }
            }
        }
    }
}