import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mexican extends Weapons 
{
    private int speed_;
    private int damage = 50;
    public Mexican()
    {  
        super();
        speed_ = 5;
    }  
    public void setSpeed(int s)
    {
        speed_ = s;
    }    
    public int getSpeed()
    {
        return speed_;
    } 
    /**
     * Act - do whatever the Weapons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move( speed_ );
        if(hitEdge())
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else if (isTouching(Enemy.class))
        {
            collision();
        }           
    }  
}