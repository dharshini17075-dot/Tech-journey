import java.util.Scanner;
public class GreaterElementsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for(int i = 0; i < N; i++)
        {
            Arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = Arr[0];
        for(int i = 1; i < N; i++)
        {
            if(Arr[i] > max)
            {
                count++;        
                max = Arr[i];   
            }
        }
         System.out.println(count);
    }
}