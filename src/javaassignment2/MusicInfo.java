/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;
/**
 *
 * @author ryanm
 */
public class MusicInfo {

    private String favSong, genre;
    private int numInstrumentPlayed;

    public MusicInfo(String favSong, String genre, int numInstrumentPlayed)
    {
        setFavSong(favSong);
        setGenre(genre);
        setNumInstrumentPlayed(numInstrumentPlayed);
    }

    public String getFavSong() {
        return favSong;
    }

    public void setFavSong(String favSong) {
        if (favSong.isEmpty())
            throw new IllegalArgumentException("Favourite Song cannot be blank");
        else
        this.favSong = favSong;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre.isEmpty())
            throw new IllegalArgumentException("Favourite Genre cannot be blank");
        else
        this.genre = genre;
    }

    public int getNumInstrumentPlayed() {
        return numInstrumentPlayed;
    }

    public void setNumInstrumentPlayed(int numInstrumentPlayed) {
        if (numInstrumentPlayed > 7 && numInstrumentPlayed < 0 )
            throw new IllegalArgumentException("Number of Instruments Played Must between 0 and 7");
        else
        this.numInstrumentPlayed = numInstrumentPlayed;
    }
    
    @Override
    public String toString() {
        return String.format("\nFavourite song is: %s\n"
                + "Favourite Genre is: %s\n"
                + "Number of Instruments played: %s",
                this.favSong, this.genre, this.numInstrumentPlayed);
    }
}