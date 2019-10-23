public class SolarObject
{
    private Point location;
    private double size;
    private String col;
    private String name;

    public SolarObject(String name,Point l, double size, String col)
    {
        this.location = l;
        this.name = name;
        this.size = size;
        this.col = col;
    }

    
    /* Accessor for the distance between a planet and the centre of the sun */
    
    public double getLocationD()
    {
        return location.getDistance();
    }

    /*
      Accessor for the angle that represents how far the planet is from its orbit
     between a planet and the centre of the sun 
     */

    public double getLocationA()
    {
        return location.getAngle();
    }

    /* Accessor for the size of a planet*/

    public double getSize()
    {
        return size;
    }

    /* Accessor for the colour of a planet */

    public String getColour()
    {
        return col;
    }


    /* Accessor for the colour of a planet */

    public String getName()
    {
        return name;
    }

    /**
     * Mutator to change the distance value of a planet from the Sun
     * @param distance is the value to which the distance between a planet and the Sun will be set to
     */

    public void setLocationD(double distance)
    {
        location.setDistance(distance);
    }

    /**
     * Mutator to change the angle value of a planet
     * @param angle is the value to which the angle of a planet's orbit will be changed to
     */

    public void setLocationA(double angle)
    {
        location.setAngle(angle);
    }

    /**
     * Mutator to change the size value of a planet
     * @param size is the value to which the size of a planet will be changed to
     */

    public void setSize(double size)
    {
        this.size=size;
    }

    /**
     * Mutator to change the colour of a planet
     * @param col is the value to which the colour of a planet will be changed to
     */

    public void setColour(String col)
    {
        this.col= col;
    }

    /**
     * Mutator to change the colour of a planet
     * @param col is the value to which the colour of a planet will be changed to
     */

    public void setName(String name)
    {
        this.name=name;
    }

}