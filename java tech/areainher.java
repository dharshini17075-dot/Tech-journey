import java.util.*;
class Shape{
   double area;
}
class circle extends Shape{
    double r;
    public void cr(){
    Scanner in=new Scanner(System.in);
    r=in.nextDouble(); 
        area=3.14*r*r;
        System.out.println("area of circle"+area);
}
    }
    class square extends Shape{
        double a;
        public void sq(){
        Scanner in=new Scanner(System.in);
    a=in.nextDouble();
            area=a*a;
            System.out.println("area of square="+area);
        }

    }
    class rectangle extends Shape{
        double b,h;
        public void rectan()
        {
            Scanner in=new Scanner(System.in);
            b=in.nextDouble();
            h=in.nextDouble();
            area=b*h;
            System.out.println("area of rectangle"+area);

        }
    }
    class areainher{
        public static void main(String[]args){
            circle obj1=new circle();
            square obj2=new square();
            rectangle obj3=new rectangle();
            obj1.cr();
            obj2.sq();
            obj3.rectan();
}
    }




