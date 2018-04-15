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
    private String favSong, genre, hourListen;

    public MusicInfo(String favSong, String genre, String hourListen)
    {
        setFavSong(favSong);
        setGenre(genre);
        setHourListen(hourListen);
    }

    public String getFavSong() {
        return favSong;
    }

    public void setFavSong(String favSong) {
        this.favSong = favSong;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getHourListen() {
        return hourListen;
    }

    public void setHourListen(String hourListen) {
        this.hourListen = hourListen;
    }
    
    public String toString()
    {
        return String.format(" Favourite song is: %s and %s and %s", this.favSong, this.genre, this.hourListen);
    }
}