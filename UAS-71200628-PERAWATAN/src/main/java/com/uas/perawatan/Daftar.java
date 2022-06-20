package com.uas.perawatan;

public class Daftar {
    private int idPemeriksaan;
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private boolean statusDaftar = false;
    private boolean StatusScreening = false;

    public boolean getStatusScreening(){
        return StatusScreening;
    }

    public void setStatusScreening() {
        StatusScreening = true;
    }

    public Pengunjung getPasien(){
        return pengunjung;
    }
    public boolean getStatusDaftar(){
        return statusDaftar;
    }

    public void setStatusDaftar() {
        this.statusDaftar = true;
    }
    public void setPasien(Pengunjung pengunjung){
        this.pengunjung = pengunjung;
    }
    public void setDokter(Pemeriksa pemeriksa){
        this.pemeriksa = pemeriksa;
    }
}
