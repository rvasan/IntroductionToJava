import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poop extends Actor
{
    int altitude = 100;
    boolean hitGround = false;
    int delay = 50;
    public Poop()
    {
        getImage().scale(25, 25);
    }

    public void act() 
    {
        if (hitGround)
        {
            delay = delay - 1;
            if (delay == 0)
            {
                getWorld().removeObject(this);
            }
        }
        else if (altitude > 10)
        {
            scale();
        }
        else
        {
            turnToSplat();
            hitGround = true;
        }
    } 

    public void scale()
    {
        altitude = altitude - 1;
        getImage().scale(altitude / 4, altitude / 4);
    }

    public void turnToSplat()
    {
        GreenfootImage image = new GreenfootImage("splat.png");
        image.scale(40, 40);
        setImage(image);
    }
    public boolean atGroundLevel()
    {
        if (altitude <= 10)
        {
            return true;
        }
        return false;
    }
}
