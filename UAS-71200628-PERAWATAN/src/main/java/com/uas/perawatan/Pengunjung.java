package com.uas.perawatan;

public class Pengunjung {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private boolean Status = false;

    public Pengunjung(String nama, int usia, String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat=alamat;
    }
    public Pengunjung(String nama, int usia, String alamat , int levelPenyakit){
        this.nama = nama;
        this.usia = usia;
        this.alamat= alamat;
        this.levelPenyakit=levelPenyakit;
    }
    public int getLevelPenyakit(){
        return levelPenyakit;
    }
    public void setLevelPenyakit(){
        this.levelPenyakit-=1;
    }
    public void setStatus(){
        this.Status = true;
    }
    public boolean getStatus(){
        return this.Status;
    }
}
