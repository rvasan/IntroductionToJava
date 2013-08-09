import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jumper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumper extends Actor
{
    /**
     * Act - do whatever the Jumper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 0;
    
    public void act() 
    {
        if (getY() < 374)
        {
            applyGravity();
        }
        else
        {
            stickToGround();
        }
    }
    public void applyGravity()
    {
        speed = speed + 1;
        setLocation (getX(), getY() + speed);
    }
}
