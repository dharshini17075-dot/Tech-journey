import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read plaintext
        System.out.print("Enter your PlainText: ");
        String text = sc.nextLine();

        // Step 2: Read key
        System.out.print("Enter the Key: ");
        int key = sc.nextInt();

        // Step 3: Check invalid key
        if(key < 0)
        {
            System.out.println("INVALID INPUT");
            return;
        }

        // Step 4: String to store encrypted text
        String encrypted = "";

        // Step 5: Traverse each character
        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            // Step 6: For uppercase letters
            if(ch >= 'A' && ch <= 'Z')
            {
                char newChar = (char)((ch - 'A' + key) % 26 + 'A');
                encrypted = encrypted + newChar;
            }

            // Step 7: For lowercase letters
            else if(ch >= 'a' && ch <= 'z')
            {
                char newChar = (char)((ch - 'a' + key) % 26 + 'a');
                encrypted = encrypted + newChar;
            }

            // Step 8: For digits
            else if(ch >= '0' && ch <= '9')
            {
                char newChar = (char)((ch - '0' + key) % 10 + '0');
                encrypted = encrypted + newChar;
            }

            // Step 9: For special characters
            else
            {
                encrypted = encrypted + ch;
            }
        }

        // Step 10: Print encrypted text
        System.out.println("The encrypted Text is: " + encrypted);
    }
}