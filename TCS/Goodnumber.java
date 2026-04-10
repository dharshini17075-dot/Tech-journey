import java.util.Scanner;
public class Goodnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int sum = 0;
        while(temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        if(n % sum == 0)
            System.out.println("Good Number");
        else
            System.out.println("Bad Number");
    }
}
