package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    static ArrayList<Song> songs;
    static int count = 0;

    public Playlist(){
        songs = new ArrayList<Song>(6);
    }
    public String getPlaylistName(){
        return playlistName;
    }
    static void print(){
        System.out.println("Jumlah Lagu = "+count+" / Kapasitas Playlist = 6");
        for(int i =0; i<songs.size();i++){
            System.out.println("ListSong["+i+"] : "+ songs.get(i).getName()+" - "+songs.get(i).getArtist());
        }
    }

    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }
    public String totalTime(){
        int hasil = 0;
        for(int i=0; i<songs.size();i++){
            int x = songs.get(i).getLength();
            hasil += x;
        }
        return "Total Waktu [Favorite] = "+hasil+" detik";
    }
    public void add(Song lagu){
        if(count<6){
            songs.add(lagu);
            count +=1;
        }else{
            System.out.println("Playlist Favorite Penuh! Tidak bisa menambahkan lagu lagi.");
        }
    }
    public Song remove(String lagu){
        for (int i=0; i<songs.size();i++){
            if(songs.get(i).getName()==lagu){
                songs.remove(i);
                count -= 1;
                System.out.println(lagu + " Berhasil terhapus...");
            }
        }
        return null;
    }
    public int size(){
        return count;
    }
}
