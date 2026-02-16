import java.util.*;
public class matsumcol

{
	public static void main(String[] args) {
		
		int [][] a=new int[3][3];
	    Scanner in=new Scanner(System.in);
	   
	    for(int i=0;i<a.length;i++){
	        for(int j=0;j<a[i].length;j++){
	            a[i][j]=in.nextInt();
	            
	        }
	    }
	        System.out.println("arrays are");
            int sum;
	         for(int i=0;i<a.length;i++){
				sum=0;
	        for(int j=0;j<a[i].length;j++){
               sum+=a[j][i];
            }
            System.out.println(sum+" ");
        }
	        
	        
	        
	    }
	}
	
	



