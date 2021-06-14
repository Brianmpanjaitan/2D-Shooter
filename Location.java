/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Location  
{
    private int x_;
    private int y_;
    
    public Location(int x, int y)
    {
        this.x_ = x;
        this.y_ = y;
    }
    
    public int getX()
    {
        return this.x_;
    }
    
    public int getY()
    {
        return this.y_;
    }
    
    public void setX(int newX)
    {
        x_ = newX;
    }
    
    public void setY(int newY)
    {
        y_ = newY;
    }
    
    public boolean equals(Location other)
    {
        if( this.x_ == other.x_ && this.y_ == other.y_)
        {
            return true;//they are the same place
        }
        else
        {
            return false;
        }
    }
    
    public double distanceTo(Location other)
    {
        int dx = this.x_ - other.x_;
        int dy = this.y_ - other.y_;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
