
/**
 * Write a description of class Online here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Online extends Multiplayer
{
    // instance variables - replace the example below with your own
    private String serverName;

    /**
     * Constructor for objects of class Online
     */
    public Online(String name, int gameID, ageRating ageRating, platform platform,
               genre genre, String releaseDate, String serverName )
    {
        super(name, gameID, ageRating, platform,genre, releaseDate);
        this.serverName = serverName;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getServerName()
    {
        return serverName;
    }
    
}
