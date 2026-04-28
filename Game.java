
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private int gameID; 
    private String gameName;
    private double[] avgRating;
    private avgRating rating;
    private gameGenre genre;
    private gamePlatform platform;
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
       
    }
    
    public enum avgRating
    {
        CHILD, TEEN, MATURE
    }
    
    public enum gameGenre
    {
        ACTION, STRATEGY, GAMBLING, ADVENTURE, STORY, RPG
    }
    
    public enum gamePlatform
    {
        PC, CONSOLE, MOBILE
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod(int y)
    {
        
    }
}
