import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

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
    int n = 0;
    int speed = 60;
    int sc = 0;
    int i = 100;
    GreenfootImage Running_Chaser2;
    
    GreenfootImage Running_Chaser3;
    
    GreenfootImage Running_Chaser4;
    
    
    
    hunter()
    {
        Running_Chaser2 = new GreenfootImage("Running_Chaser2.png");
        Running_Chaser3 = new GreenfootImage("Running_Chaser3.png");
        Running_Chaser4 = new GreenfootImage("Running_Chaser4.png");
        setRotation(-90);
        Greenfoot.setSpeed(speed);
    }
    public void act() 
    {
        if(getY()<375)
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            i = 0;
        }
        if(i < 120)
        {
            move(i%6);
            i++;
        }
        n = n + 1;
        if(n == 100)
        {
            setImage(Running_Chaser2);    
        }
        if(n == 200)
        {
            setImage(Running_Chaser3);      
        }
        if(n == 300)
        {
            setImage(Running_Chaser4);    
            n = 0;
        }
        sc++;
        if(sc == 1000 && speed < 75)
        {
            speed++;
            sc = 0;
            Greenfoot.setSpeed(speed);
        }
        if(getY() < 20)
        {
            Greenfoot.stop();
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
