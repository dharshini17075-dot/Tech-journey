import java.util.*;
public class matsumall

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
            int sum=0;
	         for(int i=0;i<a.length;i++){
	        for(int j=0;j<a[i].length;j++){
               sum+=a[i][j];
            }
        }
	        System.out.println(sum+" ");
	        
	        
	    }
	}
	
	

