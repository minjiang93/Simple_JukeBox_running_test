package unitTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jukeBox.Song;

import static org.junit.Assert.*;

public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testSong1 = new Song("Storyteller", "XiaoHun Alex", 
                "Storyteller", "Shuoshuren.mp3", "Mp3", 180);
        testSong2 = new Song("Uncommon words", "Alex", 
                "Uncommon words", "Shenpizi.mp3", "Mp3", 216);
    }
    
    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
    }

     @Test
     public void testIsLong1() {
       assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
     }
     @Test
     public void testIsLong2() {
       assertEquals("Song is long if length is more than 50",true,testSong2.isLong());
     }
     @Test
     public void testGetSongName() {
       assertEquals("Song name is:","Storyteller",testSong1.getName());
     }
     @Test
     public void testGetSongArtist() {
       assertEquals("Song artist is:","XiaoHun Alex",testSong1.getArtist());
     }
     @Test
     public void testGetSongAlbum() {
       assertEquals("Song album is:","Storyteller",testSong1.getAlbum());
     }
     @Test
     public void testGetSongUrl() {
       assertEquals("Song url is:","Shuoshuren.mp3",testSong1.getUrl());
     }
     @Test
     public void testGetSongFormat() {
       assertEquals("Song foramt is:","Mp3",testSong1.getFormat());
     }
     @Test
     public void testGetSongDuration() {
       assertEquals("Song duration is:",180,testSong1.getDuration());
     }
     @Test
     public void testSetSongName() {
	   testSong1.setName("Out of the mountain");
       assertEquals("Song name is:","Out of the mountain",testSong1.getName());
     }
     @Test
     public void testSetSongArtist() {
	   testSong1.setArtist("HuaZhou");
       assertEquals("Song artist is:","HuaZhou",testSong1.getArtist());
     }
     @Test
     public void testSetSongAlbum() {
	   testSong1.setAlbum("Out of the mountain");
       assertEquals("Song album is:","Out of the mountain",testSong1.getAlbum());
     }
     @Test
     public void testSetSongUrl() {
	   testSong1.setUrl("ChuShan.mp3");
       assertEquals("Song url is:","ChuShan.mp3",testSong1.getUrl());
     }
     @Test
     public void testSetSongFormat() {
	   testSong1.setFormat("Mp4");
       assertEquals("Song foramt is:","Mp4",testSong1.getFormat());
     }
     @Test
     public void testSetSongDuration() {
	   testSong1.setDuration(200);
       assertEquals("Song duration is:", 200 ,testSong1.getDuration());
     }
     
}
