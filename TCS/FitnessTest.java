import java.util.Scanner;

public class FitnessTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] oxygen = new int[3][3];

        // Step 1: Input oxygen values
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                oxygen[i][j] = sc.nextInt();

                // Check range
                if(oxygen[i][j] < 1 || oxygen[i][j] > 100)
                {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }

        // Step 2: Calculate average oxygen for each trainee
        int[] avg = new int[3];

        for(int i = 0; i < 3; i++)
        {
            int sum = 0;

            for(int j = 0; j < 3; j++)
            {
                sum = sum + oxygen[i][j];
            }

            avg[i] = Math.round(sum / 3);
        }

        // Step 3: Find maximum average
        int max = avg[0];

        for(int i = 1; i < 3; i++)
        {
            if(avg[i] > max)
            {
                max = avg[i];
            }
        }

        // Step 4: Check if all trainees unfit
        if(max < 70)
        {
            System.out.println("All trainees are unfit");
            return;
        }

        // Step 5: Print trainee numbers with highest average
        for(int i = 0; i < 3; i++)
        {
            if(avg[i] == max)
            {
                System.out.println("Trainee Number : " + (i + 1));
            }
        }
    }
}