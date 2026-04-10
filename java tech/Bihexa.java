
import java.util.*;
class Bihexa{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;
        
        String bi=in.nextLine();
        while(bi.length()%4!=0)
        {
            bi = "0" + bi;
        }
        String hexa=" ";
        for(int i=0;i<bi.length();i=i+4)
        {
            value=0;
            value += (bi.charAt(i)-'0')*8;
            value += (bi.charAt(i+1)-'0')*4;
            value += (bi.charAt(i+2)-'0')*2;
            value += (bi.charAt(i+3)-'0')*1;
            if(value>=10)
            hexa=hexa + (char)((value-10)+'A');
            else
            hexa=hexa + value;
        }
        System.out.println(hexa);
    }    

}
