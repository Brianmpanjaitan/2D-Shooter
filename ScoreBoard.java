import greenfoot.*;  
import java.awt.Color;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLUE, Color.WHITE));
    }        
    public void addScore()
    {
        {
            score++;
        }
    }
}