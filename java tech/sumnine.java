import java.util.*;
class sumnine{
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num,i,j,n;
    
    n=in.nextInt();
    
    int sum=0;
    for(i=1;i<=n;i++)
        {
            num=n;
            for(j=1;j<i;j++)
            {
                num=num*10;
                num=num+9;

            }
            sum=sum+num;
            System.out.println("sum="+sum);
        }
    }
}