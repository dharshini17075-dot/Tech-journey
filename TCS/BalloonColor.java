import java.util.Scanner;

public class BalloonColor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of balloons
        int N = sc.nextInt();

        // Step 2: Create array for colours
        char B[] = new char[N];

        // Step 3: Read balloon colours
        for(int i = 0; i < N; i++)
        {
            B[i] = sc.next().charAt(0);
        }

        // Step 4: Traverse array to find odd occurring colour
        for(int i = 0; i < N; i++)
        {
            int count = 0;

            // Count occurrences of B[i]
            for(int j = 0; j < N; j++)
            {
                if(B[i] == B[j])
                {
                    count++;
                }
            }

            // Check if count is odd
            if(count % 2 != 0)
            {
                System.out.println(B[i]);
                return;
            }
        }

        // Step 5: If all are even
        System.out.println("All are even");
    }
}