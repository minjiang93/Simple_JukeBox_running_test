package unitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jukeBox.Database;
import jukeBox.Song;

import static org.junit.Assert.*;

public class DatabaseTest {
   private java.util.List songList, songList1;
   private Song testSong1,testSong2;
   private Database testDB1, testDB2;
   
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        songList =  new java.util.ArrayList();
        
        testSong1 = new Song("Storyteller", "XiaoHun Alex", 
               "Storyteller", "Shuoshuren.mp3", "Mp3", 180);
        testSong1 = new Song("Uncommon words", "Alex", 
               "Uncommon words", "Shenpizi.mp3", "Mp3", 216);
        
        songList.add(testSong1);
        
        testDB1 = new Database(songList);
    }
    
    @After
    public void tearDown() {
        songList = null;
        testDB1 = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testGetSongList() {
    
      assertEquals("SongList is",songList,testDB1.getSongList());
    }
    @Test
    public void testSetSongList() {
      songList1 = new java.util.ArrayList();
      songList1.add(testSong1);
      assertEquals("Set new SongList",songList,songList1);
    }
    @Test
    public void testSongListEmpty() {
    
      assertEquals("SongList if empty should have 0 elements",false,songList.isEmpty());
    }
    @Test
    public void testaddSong() {
    	
      songList.add(testSong2);
      testDB2 = new Database(songList);
      assertNotEquals("Add song from song list",testDB1,testDB2);
    }
    @Test
    public void testRemoveSongIndex() {
      songList.remove(0);
      assertEquals("Remove song from song list",true,songList.isEmpty());
    }
    @Test
    public void testRemoveSongInfo() {
      songList.remove(testSong1);
      assertEquals("Remove song from song list",true,songList.isEmpty());
    }

}
