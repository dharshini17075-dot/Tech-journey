import java.util.*;

public class BusFare
{
    static int Path[] = {800,600,750,900,1400,1200,1100,1500};

    static String BusStops[] =
    {"TH","GA","IC","HA","TE","LU","NI","CA"};

    public static double getFare(String source,String destination)
    {
        source = source.toUpperCase();
        destination = destination.toUpperCase();

        int sIndex = -1;
        int dIndex = -1;

        for(int i=0;i<BusStops.length;i++)
        {
            if(BusStops[i].equals(source))
                sIndex = i;

            if(BusStops[i].equals(destination))
                dIndex = i;
        }

        if(sIndex == -1 || dIndex == -1)
            return -1;

        int distance = 0;
        int i = sIndex;

        while(i != dIndex)
        {
            distance += Path[i];
            i = (i+1) % BusStops.length;
        }

        double fare = (double)distance/1000*5;

        fare = Math.ceil(fare);

        return fare;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String source = sc.next();
        String destination = sc.next();

        double result = getFare(source,destination);

        if(result == -1)
            System.out.println("INVALID OUTPUT");
        else
            System.out.println(result+" INR");
    }
}