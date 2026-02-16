import java.util.*;
class arrayex{
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        int[]a=new int[5];
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        
        }
        System.out.print("\n Array element:\n");
        for (int i= 0;i<n;i++)
        {
            System.out.print(a[i]);
        }            
        }
    
}
