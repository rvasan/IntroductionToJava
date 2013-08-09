import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bird is a Bird
 * 
 * @author Rini 
 * @version 1.0
 */
public class Bird extends Actor
{
    public void act() 
    {
        checkKeys();
        checkPoopKey();
    }
    
    public void checkKeys()
    {
        if ("space".equals(Greenfoot.getKey()) )
        {
            firePoop();
        }
        if (Greenfoot.isKeyDown ("right") )
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown ("left") )
        {
           turn(4); 
        }
        if (Greenfoot.isKeyDown ("up") )
        {
            move(4);
        }
        if (Greenfoot.isKeyDown ("down") )
        {
            move(4);
        }
    } 
    
    public void checkPoopKey()
    {
        if ("space".equals(Greenfoot.getKey()) )
        {
            firePoop();
        }
    }    
    
    public void firePoop()
    {
        getWorld().addObject(new Poop(), getX(), getY());
    }   
}
