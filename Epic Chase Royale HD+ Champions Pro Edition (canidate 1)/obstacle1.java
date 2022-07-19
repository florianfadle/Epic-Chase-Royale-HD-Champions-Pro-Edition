import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class obstacle1 extends Actor
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
