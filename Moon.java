public class Moon extends Planet
{
 private Planet reference;
 public Moon(String name,double distance, double angle, double size, double velocity, String col,Planet p)
 {
     super(name,distance,angle,size,velocity,col);
     this.reference =(Planet) p;
 }

 public Planet getReference()
 {
     return reference;
 }

 public double getReferenceDistance()
 {
     return reference.getLocationD();
 }

 public double getReferenceAngle()
 {
     return reference.getLocationA();
 }

 public double getReferenceVelocity()
 {
     return reference.getVelocity();
 }
}