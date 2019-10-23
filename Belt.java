public class Belt extends SolarObject
{
  double velocity;
  public Belt(String name, double distance, double angle, double size, String col, double velocity)
  {
      super(name,new Point(distance,angle),size,col);
      this.velocity = velocity;
  }
}