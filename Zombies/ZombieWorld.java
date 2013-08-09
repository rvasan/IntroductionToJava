import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieWorld extends World
{
    ZombieHunter hunter1;
    ZombieHunter hunter2;

    public ZombieWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        hunter1 = new ZombieHunter(1);
        addObject(hunter1, 300, 150);
        hunter2 = new ZombieHunter(2);
        addObject(hunter2, 300, 450);
    }

    public ZombieHunter getRandomHunter()
    {
        if (Greenfoot.getRandomNumber(2) == 0)
        {
            return hunter1;
        }
        else
        {
            return hunter2;
        }
    }
}