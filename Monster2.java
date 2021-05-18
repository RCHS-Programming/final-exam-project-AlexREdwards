import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster2 extends Actor
{
    /**
     * Act - do whatever the Monster2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        randomTurn();
        turnAtEdge();
        LookForPlayer();
    }    
    public void move()
    {
        move(2);
    }
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )                 
       {
           turn( Greenfoot.getRandomNumber(91) - 45);                
       }
    }
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
       {
           turn(17);
       }
    }
     public void LookForPlayer()
    {
        if ( isTouching (Player.class) )        
       {
           removeTouching (Player.class);  
           Greenfoot.playSound ("game-over.wav");
           Greenfoot.stop();
       }
    }
}
