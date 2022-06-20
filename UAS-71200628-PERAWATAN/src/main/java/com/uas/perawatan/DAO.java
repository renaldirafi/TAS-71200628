package com.uas.perawatan;

import java.sql.*;

public class DAO  {
    private String url ="jdbc:mysql://localhost:3306/dao";
    public Connection connect() {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public int getPemeriksaByID(Pemeriksa pemeriksa){
        String sql = "SELECT nama FROM dokter WHERE idDokter ="+ pemeriksa.getIdDokter();
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public int getPerawatByID(Perawat perawat){
        String sql = "SELECT nama FROM suster WHERE idSuster ="+ perawat.getIdPerawat();
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public int getPendaftaranByID(Pendaftaran pendaftaran){
        String sql = "SELECT nama FROM pelayanan WHERE idPelayanan ="+ pendaftaran.getIdPelayanan();
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public Pengunjung inputPengunjung(){
        String sql = "INSERT INTO pasien VALUES (rm,nama,usia,alamat) ";
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return inputPengunjung();
    }
    public static int getPengunjungSembuh(){
        return 12345;
    }

}
