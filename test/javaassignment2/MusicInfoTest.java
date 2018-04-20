/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryanm
 */
public class MusicInfoTest {
    MusicInfo validMusicInfo;
    
    public MusicInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validMusicInfo = new MusicInfo("Thriller", "Rock", 3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFavSong method, of class MusicInfo.
     */
    @Test
    public void testGetFavSong() {    
        String expResult = "Thriller";
        String result = validMusicInfo.getFavSong();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFavSong method, of class MusicInfo.
     */
    @Test
    public void testSetFavSongInvalid() {
        String favSong = "";
        try{
            validMusicInfo.setFavSong(favSong);
            fail("FavSong name cannot be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
        
    }

    /**
     * Test of getGenre method, of class MusicInfo.
     */
    @Test
    public void testGetGenre() {
        String expResult = "Rock";
        String result = validMusicInfo.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class MusicInfo.
     */
    @Test
    public void testSetGenreInvalid() {
        String genre = "";
        try{
            validMusicInfo.setGenre(genre);
            fail("Genre name cannot be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getNumInstrumentPlayed method, of class MusicInfo.
     */
    @Test
    public void testGetNumInstrumentPlayed() {
        int expResult = 3;
        int result = validMusicInfo.getNumInstrumentPlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumInstrumentPlayed method, of class MusicInfo.
     */
    @Test
    public void testSetNumInstrumentPlayedInvalid() {
        int numInstrumentPlayed = -5;
        try{
            validMusicInfo.setNumInstrumentPlayed(numInstrumentPlayed);
             fail("Number of Instrument cannot be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of toString method, of class MusicInfo.
     */
    @Test
    public void testToString() {
         String expResult = "\nFavourite song is: Thriller\n"
                + "Favourite Genre is: Rock\n"
                + "Number of Instruments played: 3";
        String result = validMusicInfo.toString();
        assertEquals(expResult, result);
    }
    
}
