import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class hunter extends Actor
{
    /**
     * Act - do whatever the hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    hunter()
    {
        setRotation(-90);
    }
    public void act() 
    {
        if(getY()<400)
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            move(2);
        }
        
    }
    public int returnX()
    {
        return getX();
    }
    public int returnY()
    {
        return getY();
    }
}
