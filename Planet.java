/**
 * Class to represent any type of planet and it's methods
 * @author Vlad Diaconu
 */

public class Planet extends SolarObject
{
  private double velocity;

    /**
     * Constructor that creates a default planet
     */

    public Planet(String name,double distance, double angle, double size, double velocity, String col)
    {
    
       super(name, new Point(distance,angle), size, col);
       this.velocity=velocity;

    } 

    /* Accessor for the speed with which a planet rotates around its central point */

    public double getVelocity()
    {
        return velocity;
    }

    /**
     * Mutator to change the speed value of a planet
     * @param velocity is the value to which the speed of a planet will be changed to
     */


    public void setVelocity(double velocity)
    {
        this.velocity=velocity;
    }


}