import java.util.Scanner;

public class CruiseParty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read value of T (number of hours)
        int T = sc.nextInt();

        // Step 2: Create arrays for Entry and Exit
        int E[] = new int[T];
        int L[] = new int[T];

        // Step 3: Input Entry values
        for(int i = 0; i < T; i++)
        {
            E[i] = sc.nextInt();
        }

        // Step 4: Input Exit values
        for(int i = 0; i < T; i++)
        {
            L[i] = sc.nextInt();
        }

        // Step 5: Variables to track current guests and maximum guests
        int currentGuests = 0;
        int maxGuests = 0;

        // Step 6: Calculate number of guests for each hour
        for(int i = 0; i < T; i++)
        {
            currentGuests = currentGuests + E[i] - L[i];

            // Step 7: Update maximum guests
            if(currentGuests > maxGuests)
            {
                maxGuests = currentGuests;
            }
        }

        // Step 8: Print maximum guests
        System.out.println(maxGuests);
    }
}