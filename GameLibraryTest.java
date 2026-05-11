

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameLibraryTest
{
    /**
     * Default constructor for test class GameLibraryTest
     */
    public GameLibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void gamelib()
    {
        Local local1 = new Local("a", 1, ageRating.TEEN, platform.PC, genre.RPG, "2000", true);
        GameLibrary gameLibr1 = new GameLibrary();
        assertEquals("a", local1.name());
        local1.printAgeRating();
        local1.printGenre();
        assertEquals(1, gameLibr1.findGame(1));
        Local local2 = new Local("a", 2, ageRating.MATURE, platform.PC, genre.RPG, "2026", true);
        assertEquals("a", local2.toString());
        gameLibr1.addGame(local2);
    }
}
