import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class world extends Actor
{
    int n = 0;
    public void act() 
    {
        move(-1);
        n++;
        if(n >= 2000)
        {
            getWorld().removeObject(this);    
        }
    }
}
