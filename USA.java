import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class USA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class USA extends World
{
    int coolDownTrump = 30;
    int coolDownClinton = 30;
    int timer = 0;
    int x;
    int y;
    ScoreBoard scoreboard = new ScoreBoard();
    Sanders sanders = new Sanders();
    LifeCounter lifecounter = new LifeCounter();
    //public GreenfootSound sound = new GreenfootSound("anthem.mp3");
    /**
     * Constructor for objects of class USA.
     * 
     */
    public USA()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1690, 800, 1); 
        addObject(sanders,835,425);
        addObject(scoreboard,1400,675);
        addObject(lifecounter,150,675);
        //sound.play();
    }        
    public void randomCoordinate()
    {
        x = Greenfoot.getRandomNumber(1690);
        y = Greenfoot.getRandomNumber(100);
    }
    public ScoreBoard getScoreBoard()
    {
        return scoreboard;
    }    
    public LifeCounter getLifeCounter()
    {
        return lifecounter;
    }
    public void act()
    {
        spawntrump();
        spawnclinton();
    }
    public void spawntrump()
    {
        if(timer == 0 && sanders != null)
        {
            randomCoordinate();
            Trump trump = new Trump(sanders.getX(), sanders.getY());
            this.addObject(trump,x,y);
            timer = coolDownTrump;
        }
        else
        {
            timer--; //timer = timer - 1;
        }
    }  
    public void spawnclinton()
    {
        if (timer == 0 && sanders != null)
        {
            randomCoordinate();
            Clinton clinton = new Clinton(sanders.getX(), sanders.getY());
            this.addObject(clinton,x,y);
            timer = coolDownClinton;
        }
        else
        {
            timer--; //timer = timer - 1;
        }        
    }
}
