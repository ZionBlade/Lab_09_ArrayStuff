import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int[] dataPoints = new int[100];
        int sum = 0;
        int ave = 0;
        Random gen = new Random();

        for(int r = 0; r < dataPoints.length; r++)
        {
            dataPoints[r] = gen.nextInt(100) + 1;
        }

        for(int r = 0; r < dataPoints.length; r++)
        {
            System.out.print(dataPoints[r] + " | ");
        }
        // sum
        for(int r = 0; r< dataPoints.length; r++)
        {
            sum += dataPoints[r];
        }

        ave = sum / dataPoints.length;

        System.out.println("\nThe sum of the random array dataPoints is: " + sum);

        //extra credit sum
        System.out.println("\nThe sum from method sum of dataPoints is: " + sum(dataPoints));

        System.out.println("\nThe average of the random array dataPoints is: " + ave);


        int target = SafeInput.getRangedInt(console, "Enter an int ", 1, 100);
        int timesFound = 0;
        boolean found = false;

        for(int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == target)
            {
                timesFound++;
                found = true;
            }
        }
        System.out.println("Search has Finished!");
        if(!found)
        {
            System.out.println(target + " was not found in the random array dataPoints!");
        }

        System.out.println("\n" + target + " was found " + timesFound + " times!");

        // extra credit occuranceScan
        System.out.println("\nThe target from occuranceScan was found a total of " + occuranceScan(dataPoints, 45) + " times!");
        System.out.println();

        //extra credit boolean
        System.out.println("\nTarget from method contains was found: " + contains(dataPoints,25));

        found = false;

        int target2 = SafeInput.getRangedInt(console, "Enter an int ", 1, 100);

        for(int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == target2)
            {
                System.out.println("The value " + target2 + " was found at: " + r);
                found = true;
                break;
            }
        }
        System.out.println("Search has Finished!");
        if(!found)
        {
            System.out.println(target2 + " was not found in the random array dataPoints!");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int r = 0; r < dataPoints.length; r++)
        {
            if(dataPoints[r] < min)
            {
                min = dataPoints[r];
            }
            if(dataPoints[r] > max)
            {
                max = dataPoints[r];
            }
        }
        System.out.println("\nThe min is: " + min);
        System.out.println("\nThe max is: " + max);

        //extra credit min
        System.out.println("\nThe min from method min of dataPoints is: " + min(dataPoints));

        //extra credit max
        System.out.println("\nThe max from method max of dataPoints is: " + max(dataPoints));


        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int dataPoints[])
    {
        double ave = 0;
        double sum = 0;

        for(int r = 0; r< dataPoints.length; r++)
        {
            sum += dataPoints[r];
        }

        ave = sum / dataPoints.length;
        return ave;
    }

    public static int min(int dataPoints[])
    {
        int min = dataPoints[0];

        for(int r = 0; r < dataPoints.length; r++)
        {
            if(dataPoints[r] < min)
            {
                min = dataPoints[r];
            }
        }
        return min;
    }

    public static int max(int dataPoints[])
    {
        int max = dataPoints[0];

        for(int r = 0; r < dataPoints.length; r++)
        {
            if(dataPoints[r] > max)
            {
                max = dataPoints[r];
            }
        }
        return max;
    }

    public static int occuranceScan(int dataPoints[], int target)
    {
        int timesFound = 0;
        boolean found = false;

        for(int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == target)
            {
                timesFound++;
                found = true;
            }
        }
        System.out.println("Search has Finished!");
        if(!found)
        {
            System.out.println(target + " was not found in the random array dataPoints!");
        }
        else {
            System.out.println("The target of " + target + " was found!");
        }
        return timesFound;
    }

    public static int sum(int dataPoints[])
    {
        int sum = 0;

        for(int r = 0; r< dataPoints.length; r++)
        {
            sum += dataPoints[r];
        }
        return sum;
    }

    public static boolean contains(int dataPoints[], int target)
    {
        int timesFound = 0;
        boolean found = false;

        for(int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == target)
            {
                timesFound++;
                found = true;
            }
        }
        System.out.println("Search has Finished!");
        if(!found)
        {
            System.out.println(target + " was not found in the random array dataPoints!");
        }
        else {
            System.out.println("The target of " + target + " was found!");
        }
        return found;
    }
}