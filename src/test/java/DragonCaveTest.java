import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dragonCaveObj = new DragonCave();

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Firing up unit tests");
    }

    @BeforeEach
    void nextTest() {
        System.out.println("Running Next Unit test........");
    }

    @DisplayName("Input Equals One")
    @Test
    void inputEqualsOne(){
        assertEquals("You approach the cave..It is dark and spooky...A large dragon jumps out in front of you! He opens his jaw and...Gobbles you down in one bite \n", dragonCaveObj.getMessage("1"),
                "Test Failed for input One");
    }

    @DisplayName("Input Equals Two")
    @Test
    void inputEqualsTwo(){
        String outputTwo= "You approach the cave..It is full of shimmering light with treasures at every sight...A friendly dragon looks into your eyes and you become friends.." +
                "He shares his \n" + "treasures with you...You are rich for life with friendship and treasures!";
        assertEquals(outputTwo, dragonCaveObj.getMessage("2"),
                "Test Failed for input Two");
    }

    @DisplayName("Input Not Equals One or Two")
    @Test
    void inputNotEqualToOneOrTwo(){
        String output= "You have entered wrong input please enter 1 or 2.";
        assertEquals(output, dragonCaveObj.getMessage("abc"), "Input not Equal to One or Two");
    }

    @AfterEach
    void afterTest() {
        System.out.println("This test completed");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are completed.");
    }
}