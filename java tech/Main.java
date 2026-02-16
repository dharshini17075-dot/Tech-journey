import java.util.*;
public class 
{
	public static void main(String[] args) {
		
		int [][] a=new int[3][3];
	    Scanner in=new Scanner(System.in);
	   //int r=in.nextInt();
	  // int c=in.nextInt();
	    for(int i=0;i<a.length;i++){
	        for(int j=0;j<a[i].length;j++){
	            a[i][j]=in.nextInt();
	            
	        }
	    }
	        System.out.println("arrays are");
	         for(int i=0;i<a.length;i++){
	        for(int j=0;j<a[i].length;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println(" ");
	        
	        
	    }
	}
