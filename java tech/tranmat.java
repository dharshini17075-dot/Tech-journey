import java.util.*;
class tranmat{
    public static void main(String[] args){
     int[][] a=new int[3][3];
     Scanner in=new Scanner(System.in);
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){
         a[i][j]=in.nextInt();
         }
     }
     System.out.println("matrix transpose");
     int[][] b=new int[3][3];
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){
             b[i][j]=a[j][i];
              System.out.print(b[i][j]+" ");
            }
     System.out.println();
    }
    }
}
    
   
    
