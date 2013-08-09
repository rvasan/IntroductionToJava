import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpingWorld extends World
{

    /**
     * Constructor for objects of class JumpingWorld.
     * 
     */
    public JumpingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Jumper jumper = new Jumper();
        addObject(jumper, 271, 368);
        jumper.setLocation(293, 377);
    }
}
