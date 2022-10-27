import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random gen = new Random();

        for(int r = 0; r < dataPoints.length; r++)
        {
            dataPoints[r] = gen.nextInt(100) + 1;
        }

        for(int r = 0; r < dataPoints.length; r++)
        {
            System.out.print(dataPoints[r] + " | ");
        }
    }
}