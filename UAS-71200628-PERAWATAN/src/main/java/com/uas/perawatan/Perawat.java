package com.uas.perawatan;

public class Perawat {
    private int idPerawat;
    private String nama;

    public Perawat(int idPerawat, String nama){
        this.idPerawat=idPerawat; this.nama=nama;
    }
    public void screening(Pengunjung pengunjung, Daftar daftar){
        daftar.setPasien(pengunjung);
        if(daftar.getStatusDaftar()==false){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }else{
            daftar.setStatusScreening();
        }
    }
    public int getIdPerawat(){
        return idPerawat;
    }
}
