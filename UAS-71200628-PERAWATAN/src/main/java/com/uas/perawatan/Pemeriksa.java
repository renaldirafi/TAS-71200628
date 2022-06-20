package com.uas.perawatan;

public class Pemeriksa {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(int idDokter,String nama, String spesialis, String ruangan){
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }
    public void memeriksa(Pengunjung pengunjung, Daftar daftar){
        if(daftar.getStatusScreening()==true){
            if(pengunjung.getLevelPenyakit()>0){
                pengunjung.setLevelPenyakit();
            }else{
                pengunjung.setStatus();
            }
        }else{
            if(daftar.getStatusDaftar()==false){
                System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
            }else{
                System.out.println("ANDA HARUS SCREENING DULU");
            }

        }
    }
    public void cekStatus(Pengunjung pengunjung, Daftar daftar){
        if(pengunjung.getStatus()){
            System.out.println("PASIEN ANDA SUDAH SEMBUH DAN SEHAT");
        }else{
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }
    }
    public int getIdDokter(){
        return idDokter;
    }
}

