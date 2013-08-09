import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BonusBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusBrick extends Brick
{
    int direction = 2;
    public void act() 
    {
        if (atWorldEdge()) 
        {
            direction = direction * -1;
        }
        else
        {
            move(direction);
        }    
        super.act();
    }   

    public int getScoreValue()
    {
        return 1000;
    }

    public boolean atWorldEdge()
    {
        if (getX() > 10)
        {
            return true;
        }       
        if (getX() > getWorld().getWidth())
        {
            return true;
        } 
        return false;
    }
}