/**
 *Class to create the universe
 *@author Vlad Diaconu
 */

public class Universe
{
  
  private SolarSystem universe = new SolarSystem(1900,1080);
  private Sun sun = new Sun(0,150,90);
  private Planet[] planets = new Planet[8];
  private Belt[] asteroidBelt = new Belt[360];
  private SaturnRing[] ring = new SaturnRing[360];
  private Moon moon;
  private Moon[] jovianMoons = new Moon[4];

  public Universe()
  {
   planets[0] = new Planet("Earth",230,130,40,6,"BLUE");
   planets[1] = new Planet("Mercury",70,130,20,8,"ORANGE");
   planets[2] = new Planet("Venus",130,130,30,7,"#EFCC90");
   planets[3] = new Planet("Mars",280,130,25,5,"RED");
   planets[4] = new Planet("Jupiter",390,130,50,4,"#FF8C00");
   planets[5] = new Planet("Saturn",490,130,40,3,"#FFD700");
   planets[6] = new Planet("Uranus",550,130,35,2,"#00ffff");
   planets[7] = new Planet("Neptune",600,130,40,1,"#003366");
   
   moon = new Moon("Moon",40,130,14,7,"WHITE",planets[0]);
   move();
  }
  
  private void addSun()
  {
    universe.drawSolarObject(sun.getLocationD(),sun.getLocationA(),sun.getSize(),sun.getColour());

  }
  private void addPlanet(double i)
  {
   for(int k = 0; k < 8; ++k)

    universe.drawSolarObject(planets[k].getLocationD(),planets[k].getLocationA() + i * planets[k].getVelocity(),planets[k].getSize(),planets[k].getColour());

  }
  private void addAsteroids(double i)
  {
    for(int k = 0; k < 360; ++k)
    {
      asteroidBelt[k] = new Belt("Asteroid",300,130 + k,3,"GREY",1);
      universe.drawSolarObject(asteroidBelt[k].getLocationD() + (k % 7),asteroidBelt[k].getLocationA() + i/10,asteroidBelt[k].getSize(),asteroidBelt[k].getColour());

    }
  }
  private void addRing(double i)
  {
    for(int k = 0; k < 360; ++k)
    {
      ring[k]=new SaturnRing("Ring",30,130 + k,3,1,"RED");
      universe.drawSolarObjectAbout(ring[k].getLocationD(),ring[k].getLocationA() + i/10,ring[k].getSize(),ring[k].getColour(),planets[5].getLocationD(),planets[5].getLocationA() + i * planets[5].getVelocity());

    }
  }
  private void addMoon(double i)
  {
    universe.drawSolarObjectAbout(moon.getLocationD(),moon.getLocationA() + i * moon.getVelocity(),moon.getSize(),moon.getColour(),moon.getReferenceDistance(),moon.getReferenceAngle() + i * moon.getReferenceVelocity());

  }
  private void addJovianMoons(double i)
  {
    for(int k = 0; k < 4; ++k)
    {
      jovianMoons[k] = new Moon("Moon",35 + k * 10 ,110+ k * 91,8 + k,2 + k ,"#00ffff",planets[4]);
      universe.drawSolarObjectAbout(jovianMoons[k].getLocationD(),jovianMoons[k].getLocationA() + i * jovianMoons[k].getVelocity(),jovianMoons[k].getSize(),jovianMoons[k].getColour(),jovianMoons[k].getReferenceDistance(),jovianMoons[k].getReferenceAngle() + i * jovianMoons[k].getReferenceVelocity());
    }
  }
  public void move()
  {
    double i = 0;

    while(true)
    {
      i += 0.2;

      if(i == 360)
      {
        i = 0;
      }

      addSun();
      addPlanet(i);
      addMoon(i);
      addAsteroids(i);
      addRing(i);
      addJovianMoons(i);
      universe.finishedDrawing();
    }
  }


}//TODO: ADD MOON CLASS AND MOVE() FUNCTION INTO DIFFERENT CLASSES FOR ENCAPSULATION