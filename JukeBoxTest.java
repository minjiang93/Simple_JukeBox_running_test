package unitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jukeBox.Database;
import jukeBox.Jukebox;
import jukeBox.Song;

import static org.junit.Assert.*;

public class JukeBoxTest {
    private Jukebox testJB;
    private Database db1, db2;
    private java.util.List songListJB;
    private Song song1,song2;
    private int ccn=123;
    
    public JukeBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      song1 = new Song("Storyteller", "XiaoHun Alex", 
              "Storyteller", "Shuoshuren.mp3", "Mp3", 180);
      song2 = new Song("Uncommon words", "Alex", 
              "Uncommon words", "Shenpizi.mp3", "Mp3", 216);
      
      songListJB = new java.util.ArrayList();
      
      songListJB.add(song1);
      songListJB.add(song2);
      
      db1 = new Database(songListJB);
        
      testJB = new Jukebox(db1,ccn);
    }
    
    @After
    public void tearDown() {
        testJB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testDb() {
      assertEquals("Database:",db1,testJB.getDb());
    }
    @Test
    public void testSetDb() {
       db2 = new Database(songListJB);
	   testJB.setDb(db2);
      assertEquals("Song name is:",db2,testJB.getDb());
    }
    @Test
    public void testGetCreditCard() {
      assertEquals("Credit card number is:",123,testJB.getCreditCard());
    }
    @Test
    public void testSetCreditCard() {
	   testJB.setCreditCard(789);
      assertEquals("Song name is:",789,testJB.getCreditCard());
    }
     @Test
     public void testIsValidCreditCard() {
       assertEquals("Credit card is valid if value is greater than 0",true,testJB.isValidCreditCard());
     }
     /*
     @Test
     public void testPlay() {
         assertTrue(song1.play());
     }
     */
}