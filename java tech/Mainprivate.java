import java.util.*;
class Circle{
    double r,area;
    
    private void getdata(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter r:");
        r=in.nextDouble();
    }
    public void calc(){
        getdata();
        area=3.14*r*r;
        System.out.print("area="+area);
    }
}
public class Mainprivate{
        public static void main(String[] args)
        {
            Circle obj=new Circle();
            
            obj.calc();
        }
    }
    
    