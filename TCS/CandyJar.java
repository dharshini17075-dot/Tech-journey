import java.util.Scanner;

public class CandyJar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 10;   // Maximum capacity of jar
        int K = 5;    // Minimum candies allowed
        int candies = N; // Current candies in jar

        // Display candies available in jar
        System.out.println("CANDIES AVAILABLE : " + candies);

        // Take input from customer
        int order = sc.nextInt();

        // Check if order is valid
        if(order > candies)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            // Sell candies
            candies = candies - order;

            // Display candies sold
            System.out.println("NUMBER OF CANDIES SOLD : " + order);

            // Display remaining candies
            System.out.println("NUMBER OF CANDIES LEFT : " + candies);

            // Check if jar needs refill
            if(candies <= K)
            {
                candies = N;
                System.out.println("JAR REFILLED");
                System.out.println("CANDIES AVAILABLE : " + candies);
            }
        }
    }
}