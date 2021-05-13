import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Overworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Overworld extends World
{

    /**
     * Constructor for objects of class Overworld.
     * 
     */
    public Overworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        addObject(new Gold(),Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Gold(),Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Gold(),Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Gold(),Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Gold(),Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        addObject(new Player(), 60, 100);
        addObject(new Monster1(),100, 200);
        addObject(new Monster1(), 300, 400);
        addObject(new Monster1(), 400, 300);
        addObject(new Monster2(), 200, 200);
        addObject(new Monster2(), 400, 100);
        addObject(new Monster2(), 300, 500);
        addObject(new Tree(), 350, 400);
        addObject(new Tree(), 250, 300);
        addObject(new Tree(), 150, 200);
        addObject(new Tree(), 550, 400);
        addObject(new Tree(), 450, 200);
        addObject(new Tree(), 350, 100);
        addObject(new Door(), 400, 0);
        addObject(new Wall(), 0, 10);
        addObject(new Wall(), 100, 10);
        addObject(new Wall(), 200, 10);
        addObject(new Wall(), 300, 10);
        addObject(new Wall(), 500, 10);
        addObject(new Wall(), 600, 10);
        
    }
}
