import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sanders extends Democrats
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        reloadTime_--;
        obombaTime_--;
        if (Greenfoot.isKeyDown("Left"))
        {
            turn(-8);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            turn(8);
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            move(8);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            move(-8);
        }
        if (reloadTime_ <= 0)
        {
            if (Greenfoot.isKeyDown("space"))
            {
                fire();
            }
        }
        if (obombaTime_ <= 0)
        {
            if (Greenfoot.isKeyDown("z"))
            {
                shoot();
            }
        }
        checkLife();
    }
    private void checkLife()
    {
        USA myWorld = (USA)getWorld();
        int life = myWorld.getLifeCounter().life;
        if(life == 0)
        {
            myWorld.removeObject(this);
        }
    }
}