import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Lifecounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCounter extends Actor
{
    public static int life = 3;
    /**
     * Act - do whatever the Lifecounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Lives: " + life, 40, Color.BLUE, Color.WHITE));  
    }    
    public static void removeLife()
    {
        {
            life--;
        }
    }
}
