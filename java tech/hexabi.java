import java.util.*;
class hexabi{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
int i,num;
System.out.println("Enter a no");
String hexa = in.nextLine();
char value=' ';
for(i=0;i<hexa.length();i++)
{
    value=hexa.charAt(i);
    if(value>='0' && value<='9')
        num=value-'0';
        else
            num=value- 'A'+10;
        int rem;String bi="";
        while(num>0)
            
            {
            rem=num%2;
            bi=rem+bi;
            num=num/2;
            }
            System.out.println(bi);
}
}
            
        }
        

        