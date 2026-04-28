
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SinglePlayer extends Game
{
    // instance variables - replace the example below with your own
    private boolean storyMode;
    private double gameDuration;
    /**
     * Constructor for objects of class SinglePlayer
     */
    public SinglePlayer(String name, int gameID, ageRating ageRating, platform platform,
    genre genre, String releaseDate , boolean storyMode, double gameDuration)
    {
        // initialise instance variables
        super(name, gameID, ageRating, platform,genre, releaseDate);
        this.storyMode = storyMode;
        this.gameDuration = gameDuration;
    }

    public boolean isStoryMode() //if game is a story mode, sometimes games 
                                 //haves multiplayer / singleplayer options
    {
        return storyMode;
    }
    
    public double getGameDuration()
    {
        return gameDuration;
    }
}
