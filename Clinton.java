import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clinton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clinton extends Enemy
{
    public Clinton(int x, int y)
    {
        super(); 
        setHealth(200);
        setGoal(x,y);
    }
    /**
     * Act - do whatever the Clinton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();//do everything that a goalmover does
    }
    public void points()
    {
        World world = getWorld();
        Weapons weapons = (Weapons)getOneIntersectingObject(Weapons.class);
        world.removeObject(weapons);
    }
}
