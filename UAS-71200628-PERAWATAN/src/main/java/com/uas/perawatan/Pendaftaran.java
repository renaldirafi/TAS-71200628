package com.uas.perawatan;

import java.util.Scanner;

public class Pendaftaran {
    private int idPelayanan;
    private String nama;

    public Pendaftaran(int idPelayanan,String nama){
        this.idPelayanan=idPelayanan;this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar){
        if(pengunjung.getStatus()==false){
            daftar.setPasien(pengunjung);
            daftar.setDokter(pemeriksa);
            daftar.setStatusDaftar();
            System.out.println("Proses Pengaturan Jadwal Berhasil");
        }
    }
    public Pengunjung registrasi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan rm baru:");
        int rm = inp.nextInt();
        System.out.print("Masukkan Nama anda: ");
        String uname = inp.next();
        System.out.print("Masukkan Usia anda: ");
        int umur = inp.nextInt();
        System.out.print("Masukkan Alamat anda: ");
        String alamat = inp.next();
        System.out.print("Masukkan penyakit anda: ");
        String penyakit = inp.next();
        System.out.println("Proses Registrasi Berhasil");
        return new Pengunjung(uname,umur,alamat,3);
    }

    public int getIdPelayanan(){
        return idPelayanan;
    }
}
