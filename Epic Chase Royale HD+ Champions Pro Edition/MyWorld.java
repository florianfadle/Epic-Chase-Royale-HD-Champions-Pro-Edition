import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    int n = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 480, 1); 
        world world = new world();
        addObject(world,1280, 440);
        hunter hunter = new hunter();
        addObject(hunter, 200, 400);
    }
    public void act()
    {
        n++;
        if (n == 640)
        {
            world world2 = new world();
            addObject(world2, 1280, 440 );    
            n = 0;
            
        }
    }
   
}