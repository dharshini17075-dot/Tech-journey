import java.util.Scanner;
public class ValidStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int starCount = 0;
        int hashCount = 0;
        for(int i = 0; i < S.length(); i++)
        {
            char ch = S.charAt(i);
            if(ch == '*')
            {
                starCount++;
            }
            else if(ch == '#')
            {
                hashCount++;
            }
        }
        int result = starCount - hashCount;
        System.out.println(result);
    }
}