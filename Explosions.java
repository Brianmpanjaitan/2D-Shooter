import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosions extends Actor
{
    GifImage explosions;
    int livesfor;
   
    public Explosions(String fileName)
    {
        super();
        explosions = new GifImage(fileName);
    }
    public void setlivesfor(int t)
    {
        livesfor = t;
    }
    /**
     * Act - do whatever the Explosions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(explosions.getCurrentImage());
        removegif();
    }    
    public void removegif()
    {
        if (livesfor == 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
            livesfor--;
        }
    }  
}
