import java.util.*;
class larmat{
    public static void main(String[] args){
     int[][] a=new int[3][3];
     Scanner in=new Scanner(System.in);
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
         a[i][j]=in.nextInt();
         }
     }
     int lar=a[0][0];
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
            
             if(a[i][j]>lar)
             lar=a[i][j];
         }
     }
     System.out.println("largest element is" +lar);
     
             
     
    
    }
    
}
