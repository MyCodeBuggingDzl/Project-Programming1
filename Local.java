
/**
 * Write a description of class Local here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Local extends Multiplayer
{
    // instance variables - replace the example below with your own
    private boolean isLAN;

    /**
     * Constructor for objects of class Local
     */
    public Local(String name, int gameID, ageRating ageRating, platform platform,
               genre genre, String releaseDate, boolean isLAN )
    {
        super(name, gameID, ageRating, platform,genre, releaseDate);
        this.isLAN = isLAN;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean sampleMethod()
    {
       return isLAN;
    }
}
