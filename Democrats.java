import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Democrats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Democrats extends Actor
{
    public int reloadTime_;
    public int obombaTime_;
    public int life;
    public Democrats()
    {
        super();
        life = 3;
    }
    
    /**
     * Act - do whatever the Democrats wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Enemy.class))
        {
            takeLife();
        }
        else if (life <= 0)
        {
            gameOver();
        }
    }    
    public void shoot()//This allows you to fire Obomba's
    {
        Obomba fireThis = new Obomba();
        fireThis.setSpeed(5);
        fireThis.setRotation( this.getRotation() );
        
        World usa = getWorld();
        usa.addObject(fireThis, this.getX(), this.getY());
        
        obombaTime_ = 100;
    }
        public void fire()//This allows you to fire Mexicans 
    {
        Mexican fireThis = new Mexican();
        fireThis.setSpeed(15);
        fireThis.setRotation( this.getRotation() );
        
        World usa = getWorld();
        usa.addObject(fireThis, this.getX(), this.getY());
        
        reloadTime_ = 12;
    }
    public void takeLife()
    { 
      {
        World world = getWorld();
        USA usa = (USA)world; 
        LifeCounter lifecounter = usa.getLifeCounter();
        LifeCounter.removeLife();
      }
    }
    public void gameOver()
    {
        World world = getWorld();        
        Sanders player = (Sanders)getOneIntersectingObject(Sanders.class);
        world.removeObject(player);
        Greenfoot.stop();
    }
}
