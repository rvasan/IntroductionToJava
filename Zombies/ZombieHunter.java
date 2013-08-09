import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieHunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieHunter extends Actor
{
    boolean facingLeft = false;
    /**
     * Act - do whatever the ZombieHunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFireKey();
    } 
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 5);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if (facingLeft)
            {
                setLocation(getX() - 5, getY());
            }
            else
            {
                getImage().mirrorHorizontally();
                facingLeft = true;
            }
        }
         if(Greenfoot.isKeyDown("right"))
        {
            if (facingLeft)
            {
                getImage().mirrorHorizontally();
                facingLeft = false;
            }
            else
            {
                setLocation(getX() + 5, getY());
            }
        }
    }
    public void checkFireKey()
    {
        if ("space".equals(Greenfoot.getKey()))
        {
            fireBullet();
        }
    }
    
    public void fireBullet()
    {
        Bee bee = new Bee();
        getWorld().addObject(bee, getX(), getY());
        if (facingLeft)
        {
            bee.turn(180);
            bee.getImage().mirrorVertically();
        }
    }
}
