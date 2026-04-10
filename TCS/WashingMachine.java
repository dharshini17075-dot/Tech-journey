import java.util.Scanner;

public class WashingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read weight input
        int weight = sc.nextInt();

        // Step 2: Check invalid input
        if(weight < 0)
        {
            System.out.println("INVALID INPUT");
        }

        // Step 3: Check overloaded condition
        else if(weight > 7000)
        {
            System.out.println("OVERLOADED");
        }

        // Step 4: Weight is zero
        else if(weight == 0)
        {
            System.out.println("Time Estimated: 0 minutes");
        }

        // Step 5: Low water level
        else if(weight <= 2000)
        {
            System.out.println("Time Estimated: 25 minutes");
        }

        // Step 6: Medium water level
        else if(weight <= 4000)
        {
            System.out.println("Time Estimated: 35 minutes");
        }

        // Step 7: High water level
        else
        {
            System.out.println("Time Estimated: 45 minutes");
        }

    }
}