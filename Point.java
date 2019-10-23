/**
 * Class to represent a location in the "Solar System" class by distance and angle
 * @author Vlad Diaconu
 */
public class Point
{
    private double distance;
    private double angle;

    public Point(double distance, double angle)
    {
        this.distance = distance;
        this.angle = angle;
    }

    public double getDistance()
    {
        return distance;
    }
    
    public double getAngle()
    {
        return angle;
    }

    public void setDistance(double d)
    {
        distance = d;
    }

    public void setAngle(double a)
    {
        angle = a;
    }

}