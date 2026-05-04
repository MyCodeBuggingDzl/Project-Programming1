import java.util.ArrayList;

/**
 * Write a description of class GameLibrary here.
 *
 * @Denzel
 * @version (a version number or a date)
 */
public class GameLibrary
{
    // instance variables - replace the example below with your own
    private ArrayList<Game> games;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary()
    {
        // initialise instance variables
        games = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addGame(Game game)
    {
        // put your code here
        games.add(game);
    }
    
    public void printAllGame()
    {
        for(Game g : games){
            System.out.println(g);
        }
    }
    
    public Game findGame(int id) //finds game with ID
    {
        for(Game g : games){
            if(g.gameID() == id){
                return g;
            }
        }
        return null;
    }
    
    public Game findGameName(String name) //find game by name
    {
        for(Game g : games){
            if(g.name().equalsIgnoreCase(name)){
                return g;
            }
        }
        return null;
    }
    
    // must add show avg rating using gameID
    //add rating 
}
