package epam.katsapov;

public class Area_of_the_ring
{
    //площадь
    public static double CircleArea(double rad) {
        return rad * rad * Math.PI;
    }

    //внешний радиус
    public static double RingArea(double r1, double r2) {
        return CircleArea(r1) - CircleArea(r2);
    }
}
