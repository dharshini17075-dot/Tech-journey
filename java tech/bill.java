import java.util.Scanner;

class Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int unit;
        System.out.println("Enter unit consumed:");
        unit = in.nextInt();

        if (unit <= 100)
            System.out.println(unit * 1 + " rupees");
        else if (unit <= 200)
            System.out.println(unit * 2 + " rupees");
        else if (unit <= 300)
            System.out.println(unit * 3 + " rupees");
        else
            System.out.println(unit * 5 + " rupees");
    }
}
