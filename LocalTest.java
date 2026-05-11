

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LocalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LocalTest
{
    /**
     * Default constructor for test class LocalTest
     */
    public LocalTest()
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
        Game g1 = new Game ("hole.io",1, ageRating.TEEN, platform.PC, genre.ADVENTURE, "2011");
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
    public void test()
    {
        GameLibrary gameLibr1 = new GameLibrary();
    }
}

