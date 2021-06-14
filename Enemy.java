import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private Location goal_;
    private int speed_;
    public int health;
    private int h;
    public Enemy()
    {
        health = (100);
        goal_ = null;
        speed_ = 3;
    }  
    public void health()
    {
        health = h;
    }
    public int setHealth(int h)
    {
        return h;
    }
    public int getSpeed()
    {
        return speed_;
    }
    public void setSpeed(int s)
    {
        speed_ = s;
    }
    public void setGoal(Location loc)
    {
        goal_ = loc;
    } 
    public void setGoal(int x, int y)
    {
        goal_ = new Location(x,y);
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(goal_ != null)//we have a goal :) !!
        {
            if( !reachedGoal() )//keep moving
            {
                moveTowardsGoal();
            }
        }
        if(reachedGoal())
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else if(isTouching(Sanders.class))
        {
            takeLife();
        }
    } 
    public void takeLife()
    {
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            USA usa = (USA)myWorld;
            LifeCounter lifecounter = usa.getLifeCounter();
            LifeCounter.removeLife();
        }
        }
   public boolean reachedGoal()
    {
        Location place = new Location(getX(), getY());
        return place.equals(goal_);
    }    
    public void moveTowardsGoal()
    {
        //should I move left or right?
        int xChange = goal_.getX() - getX();        
        //should I move up or down?
        int yChange = goal_.getY() - getY();        
        int xMove = 0;
        if(xChange < 0)//need to move left
        {
            if( speed_ >= -xChange )
            {
                xMove = xChange;//will hit the correct X
            }
            else
            {
                xMove = -speed_;
            }
        }
        else
        {
            if( speed_ >= xChange )
            {
                xMove = xChange;//will hit the correct X
            }
            else
            {
                xMove = speed_;
            }
        }     
        int yMove = 0;
        if(yChange < 0)//need to move up
        {
            if( speed_ >= -yChange )
            {
                yMove = yChange;//will hit the correct Y
            }
            else
            {
                yMove = -speed_;
            }
        }
        else
        {
            if( speed_ >= yChange )
            {
                yMove = yChange;//will hit the correct X
            }
            else
            {
                yMove = speed_;
            }
        }       
        setLocation(getX() + xMove, getY() + yMove);
    }
}