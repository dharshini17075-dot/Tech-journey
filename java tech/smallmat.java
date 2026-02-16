import java.util.*;
class smallmat{
    public static void main(String[] args){
     int[][] a=new int[3][3];
     Scanner in=new Scanner(System.in);
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
         a[i][j]=in.nextInt();
         
         
     }
     }
     int small=a[0][0];
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
            
             if(a[i][j]<small)
             small=a[i][j];
         }
     }
     System.out.println("smallest element is" +small);
     
             
     
    
    }
    
}