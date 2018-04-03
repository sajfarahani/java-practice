package com.javapractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String tittle, double duration) {
//        if(findSong(tittle) == null){
//            this.songs.add(new Song(tittle, duration));
//            return true;
//        }
//        return false;
        return this.songs.add(new Song(tittle, duration));
    }



    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
//        int index = trackNumber -1;
//        if((index >= 0) && (index <= this.songs.size())){
//            playlist.add(this.songs.get(index));
//            return true;
//        }
//            System.out.println("This album does not have a track " + trackNumber);
//            return false;
        Song chekedSong = this.songs.findSong(trackNumber);
        if(chekedSong != null){
            playlist.add(chekedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String tittle, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(tittle);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + tittle + " is not in this album");
        return false;
    }


    private class SongList {

        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Song findSong(String title){
            for (Song checkedSong: this.songs){
                if(checkedSong.getTittle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if ((index >=0) && (index<songs.size())){
                return songs.get(index);
            }
            return null;
        }

    }

}
