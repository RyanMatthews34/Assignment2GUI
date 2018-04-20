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
            throw new IllegalArgumentException("genre Song cannot be blank");
        else
        this.genre = genre;
    }

    public int getNumInstrumentPlayed() {
        return numInstrumentPlayed;
    }

    public void setNumInstrumentPlayed(int numInstrumentPlayed) {
        if (numInstrumentPlayed < -1)
            throw new IllegalArgumentException("numInstrumentPlayed Must be greater than 0");
        else
        this.numInstrumentPlayed = numInstrumentPlayed;
    }
    
    @Override
    public String toString() {
        return String.format("Favourite song is: %s %n"
                + "Favourite Genre is: %s %n"
                + "Number of Instruments played: %s %n",
                this.favSong, this.genre, this.numInstrumentPlayed);
    }
}