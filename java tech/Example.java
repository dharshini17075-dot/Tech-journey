public class Example{
    static String college="HICET";
    String name;
    Example(String name)
    {
        this.name=name;

    }
    public void disp()
    {
        System.out.print(name +" "+"studies@"+" "+college);

    }
    public static void main(String[]args)
    {
        Example obj=new Example("dharshini");
        obj.disp();
        
    }
}

