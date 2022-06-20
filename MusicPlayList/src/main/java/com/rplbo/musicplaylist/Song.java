package com.rplbo.musicplaylist;

public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;

    public Song(String songName,String artistName, String albumName,int songLength){
        this.name = songName;
        this.artist = artistName;
        this.album = albumName;
        this.length=songLength;
    }
    public void setArtist(String nama){
        this.artist = nama;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public void setLength(int length){
        this.length=length;
    }
    public String getArtist(){
        return artist;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAlbum(){
        return this.album;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
