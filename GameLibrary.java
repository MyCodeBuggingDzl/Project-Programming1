import java.util.ArrayList;

/**
 * Write a description of class GameLibrary here.
 *
 * @Denzel
 * @version (a version number or a date)
 */
public class GameLibrary
{
    private ArrayList<Game> games;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary()
    {
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
    public void rateGame(int id, int index, double rating)
    {
        Game g = findGame(id); 
        if (g !=null ){
            g.addRating(index, rating);   
        }
        else
        {
            System.out.println ("Not Found");
        }
    }
    
    public static void main(String[] args)
    {
        GameLibrary lib = new GameLibrary();
        Game g1 = new Game ("draw.io",1, ageRating.TEEN, platform.PC, genre.ADVENTURE, "2011");
        lib.addGame(g1);

        Game g2 = new Game ("Minecraft", 6, ageRating.EVERYONE, platform.PC, genre.SANDBOX, "2011");
        lib.addGame(g2);
        
        Game g3 = new Game ("Fortnite", 7, ageRating.TEEN, platform.PC, genre.BATTLEROYALE, "2017");
        lib.addGame(g3);

        SinglePlayer g4 = new SinglePlayer("The Last of Us", 5, ageRating.MATURE, platform.PLAYSTATION, genre.ACTION, "2013", true, 1500);
        lib.addGame(g4);

        Multiplayer  g6 = new Local("Mario Kart", 4, ageRating.EVERYONE, platform.NINTENDO, genre.RACING, "2014", true);
        lib.addGame(g6);

        Multiplayer g7 = new Local("Super Smash Bros", 8, ageRating.EVERYONE, platform.NINTENDO, genre.FIGHTING, "2018", true);
        lib.addGame(g7);

        Multiplayer g8 = new Local("Overcooked", 9, ageRating.EVERYONE, platform.PC, genre.SIMULATION, "2016", true);
        lib.addGame(g8);

        Multiplayer g9 = new Local("Rocket League", 10, ageRating.EVERYONE, platform.PC, genre.SPORTS, "2015", true);
        lib.addGame(g9);

        SinglePlayer g10 = new SinglePlayer("Red Dead Redemption 2", 11, ageRating.MATURE, platform.PLAYSTATION, genre.ACTION, "2018", true, 2000);
        lib.addGame(g10);
        
        SinglePlayer g11 = new SinglePlayer("The Witcher 3", 2, ageRating.MATURE, platform.PC, genre.RPG, "2015", true, 3000);
        lib.addGame(g11);

        Game g12 = new Game ("Genshin Impact", 13, ageRating.TEEN, platform.PC, genre.ACTION, "2020");
        lib.addGame(g12);
        
        lib.printAllGame();
        lib.rateGame(1, 0 , 4.5);
        lib.rateGame(2, 0 , 5.0);
        lib.rateGame(3, 0 , 4.7);
        lib.rateGame(4, 0 , 4.8);
        lib.rateGame(5, 0 , 4.9);
        lib.rateGame(6, 0 , 4.6);
        lib.rateGame(7, 0 , 4.4);
        lib.rateGame(8, 0 , 4.3);
        lib.rateGame(9, 0 , 4.2);
        lib.rateGame(10, 0 , 4.9);
        lib.rateGame(11, 0 , 4.1);
        lib.rateGame(12, 0 , 4.0);
         System.out.println(g1.getAvgRating());
    }
}
