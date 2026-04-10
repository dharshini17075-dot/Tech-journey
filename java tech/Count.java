class Count{
    static int count=0;
    Count()
    {
        count=count+1;

    }
    public void disp()
    {
        System.out.print("objects created: " + count);

    }
}
class main
{
    public static void main(String[] args) {
        {
            Count obj1=new Count();
            Count obj2=new Count();
            Count obj3=new Count();
            obj3.disp();
        }

    }
}
