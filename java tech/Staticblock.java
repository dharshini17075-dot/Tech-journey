class Staticmain{
    static int count;
    static {
        count=0;
        System.out.println("static member initialized");
    }
    Staticmain()
    {
        count=count+1;
    }
    static void disp()
    {
        System.out.print("count="+count);
    }
}
class Staticblock{
    public static void main(String[] args) 
        {
            System.out.print("Driver class started");
            Staticmain obj1=new Staticmain();
            Staticmain obj2=new Staticmain();
            Staticmain.disp();
        }
    }


