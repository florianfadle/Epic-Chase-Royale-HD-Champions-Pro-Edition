import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacle2 extends Actor
{
    int n = 0;
    public void act() 
    {
        n++;
        move(-1);// Add your action code here.
        if(n==1280)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(hunter.class))
        {
            Greenfoot.stop();   
        }
    }     
}
