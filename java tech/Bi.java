import java.util.*;
class Bi{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;
        String bi=in.nextLine();
        while(bi.length()%3!=0)
        {
            bi = "0" + bi;
        }
        String oct=" ";
        for(int i=0;i<bi.length();i=i+3)
        {
            value=0;
            
            value += (bi.charAt(i)-'0')*4;
            value += (bi.charAt(i+1)-'0')*2;
            value += (bi.charAt(i+2)-'0')*1;
            oct=oct+value;
        }
        System.out.println(oct);
    }    

}
