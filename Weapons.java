import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List.*;
/**
 * Write a description of class Weapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapons extends Actor
{
    private int speed_;
    public Weapons()
    {
        speed_ = 1;
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
        removeAtEdge();
        move( speed_ );
    }    
    public void removeAtEdge()
    {
        
        if (isAtEdge())
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else if (isTouching(Enemy.class))
        {
            collision();
        }  
    }
    public boolean hitEdge()
    {
        World world = getWorld();
        int width = world.getWidth();
        int height = world.getHeight();
        
        int Weapons = getImage().getWidth()/2;
        int x = getX();
        int y = getY();
        
        if(x + Weapons >= width)
        {
            return true;
        }
        else if(x - Weapons <= 0)
        {
            return true;
        }
        else if(y + Weapons >= height)
        {
            return true;
        }
        else if(y - Weapons <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
    public void collision()
    {
        Actor enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if (enemy != null)
        {
            World myWorld = getWorld();
            myWorld.addObject(new Explosion2(), enemy.getX(), enemy.getY());
            Greenfoot.playSound("bombnoise.wav");
            myWorld.removeObject(this);
            myWorld.removeObject(enemy);
            USA usa = (USA)myWorld;
            ScoreBoard scoreboard = usa.getScoreBoard();
            scoreboard.addScore();
        }
    }
    public void explosion()    
    {
        Actor enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if (enemy != null)
        {
            World myWorld = getWorld();
            myWorld.addObject(new Explosion(), enemy.getX(), enemy.getY());
            Greenfoot.playSound("bombnoise.wav");
            myWorld.removeObject(enemy);
            USA usa = (USA)myWorld;
            ScoreBoard scoreboard = usa.getScoreBoard();
            scoreboard.addScore();            
        }
    }
}