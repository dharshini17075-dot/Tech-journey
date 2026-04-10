import java.util.*;
class A{
    protected int a;
    public void getdata(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
    }
}
class B extends A{
    int b;
    public void getdata(){
        super.getdata();
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
    }
}
public class Eginher{
    int c;
    public void sum(B obj){
        c=obj.a+obj.b;
        System.out.println("Eginher="+c);
    }
    public static void main(String[] args) {
        Eginher obj=new Eginher();
        B obj1=new B();
        obj1.getdata();
        obj.sum(obj1);

    }
}

        