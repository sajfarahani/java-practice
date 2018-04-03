package com.javapractice;

public class Song {
    private String tittle;
    private double duration;

    public Song(String tittle, double duration) {
        this.tittle = tittle;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    @Override
    public String toString(){
        return this.tittle + ": " + this.duration;
    }
}
