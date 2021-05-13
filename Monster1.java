import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster1 extends Actor
{
    /**
     * Act - do whatever the Monster1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        randomTurn();
        turnAtEdge();
    }    
     public void move()
    {
        move(3);
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
}
