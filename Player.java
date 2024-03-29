import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int goldObtain;
    public Player()
    {
        goldObtain = 0;
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        PlayerMovement();
        detectMonster1Collision();
        detectMonster2Collision();
        goldGet();
    }    
    
    public void PlayerMovement()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() -3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() +3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() -3, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() +3, getY());
        }
    }
     public void detectMonster1Collision()
    {
        if(isTouching(Monster1.class))
        {
            setLocation( 60, 100);
            Greenfoot.playSound("hurt.wav");
        }
    }
     public void detectMonster2Collision()
    {
        if(isTouching(Monster2.class))
        {
            setLocation(60, 100);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void goldGet()
    {
        if( isTouching (Gold.class))
        {
            removeTouching (Gold.class);
            Greenfoot.playSound("yipee.wav");
            goldObtain = goldObtain + 1;
            if(goldObtain==5)
            {
                Greenfoot.playSound("yipee.wav");
                Greenfoot.stop();
            }
        }
    }
}
