import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obomba extends Weapons
{
    private int speed;
    public Obomba()
    {
        super();
        speed = 1;
    }
    public void setSpeed(int s)
    {
        speed = s;
    }    
    public int getSpeed()
    {
        return speed;
    } 
    /**
     * Act - do whatever the Obomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move( speed );
        if(hitEdge())
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else if (isTouching(Enemy.class))
        {
            explosion();
        }
    }    
}
