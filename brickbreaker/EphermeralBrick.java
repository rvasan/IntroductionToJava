import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EphermeralBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EphermeralBrick extends Brick
{
    int delay = Greenfoot.getRandomNumber(100) + 500;
    /**
     * Act - do whatever the EphermeralBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        delay = delay - 1;
        if (delay == 0)
        {
            getImage(). setTransparency(0);
            getImage().setTransparency(255);
        } 
        if (Greenfoot.getRandomNumber(100) == 0)
        {
            delay = 100;
            getImage().setTransparency(255);
        } 
        else
        {
            delay = delay - 1;
            super.act();
        }    
    }
}