import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    int n = 0;
    int o = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 480, 1); 
        world world = new world();
        addObject(world,1280, 440);
        hunter hunter = new hunter();
        addObject(hunter, 200, 375);
        world u = new world();
        addObject(u,320,440);
        
        
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
        o++;
        if (o >= 700 && Greenfoot.getRandomNumber(500)== 1)
        {
            int r = Greenfoot.getRandomNumber(3);
            if(r == 1)
            {
                obstacle1 obstacle1 = new obstacle1();
                addObject(obstacle1, 1280, 377);    
            }
            else if(r == 2)
            {
                obstacle2 obstacle2 = new obstacle2();
                addObject(obstacle2, 1280, 377);    
            }
            else 
            {
                obstacle3 obstacle3 = new obstacle3();
                addObject(obstacle3, 1280, 377);    
            }
            o = 0;
        }
        
    }
   
}