package com.javapractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String tittle, double duration) {
        if(findSong(tittle) == null){
            this.songs.add(new Song(tittle, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String tittle){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTittle().equals(tittle)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
            System.out.println("This album does not have a track " + trackNumber);
            return false;
    }

    public boolean addToPlaylist(String tittle, LinkedList<Song> playlist){
        Song checkedSong = findSong(tittle);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + tittle + " is not in this album");
        return false;
    }


}
