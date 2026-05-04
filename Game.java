
/**
 * Write a description of class Game here.
 *
 * @Denzel
 * @2026-05-04
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
       avgRating = new double[5];
    }
    
    public String name() //gets game name
    {
       return name; 
    }
    
    public int gameID() // gets gameID
    {
        return gameID;
    }
    
    public double getAvgRating() //gets avgRAting
    {
        double sum = 0;
        int count = 0;
        for(double rating: avgRating){
            if(rating > 0){
                sum += rating;
                count++;
            }
        }
        return sum/count; 
    }
    
    public void addRating(int i, double rating)// add rating to game
    {                     //store rate, rating
        if(i >= 0 && i < avgRating.length){
            avgRating[i] = rating;
        }
    }
    
    public void printReleaseDate()  //get release date
    {
        System.out.println(releaseDate);
    }
    
    public void printGenre()
    {
        System.out.println(genre);
    }
    
    public void printAgeRating()
    {
        System.out.println(ageRating);
    }
    
    public void printPlatform()
    {
        System.out.println(platform);
    }
}
