
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
    private String name;
    private double[] avgRating;
    private String releaseDate;
    
    private genre genre;
    private platform platform;
    private ageRating ageRating;
    
    /**
     * Constructor for objects of class Game
     */         //create game
    public Game(String name, int gameID, ageRating ageRating, platform platform,
               genre genre, String releaseDate )
    {
       this.name = name;
       this.gameID = gameID;
       this.ageRating = ageRating;
       this.platform = platform;
       this.genre = genre;
       this.releaseDate = releaseDate;
    }
    
    public String name() //gets game name
    {
       return name; 
    }
    
    public int gameID() // gets gameID
    {
        return gameID;
    }
}
