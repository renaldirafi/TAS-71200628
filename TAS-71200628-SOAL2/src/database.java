import java.sql.*;

public class database {
    public static void createNewDatabase(String filename){
        String url = "C:\\sqlite\\sqlite-jdbc-3.36.0.3.jar"+filename;
        try{
            Connection conn = DriverManager.getConnection(url);
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void createNewTable(){
        String url = "C:\\sqlite\\sqlite-jdbc-3.36.0.3.jar\\waktu";
        String sql ="CREATE TABLE IF NOT EXISTS waktu (\n"+
                "nomor integer not null" +
                "constraint waktu_pk" +
                "primary key autoincrement," +
                "waktu text not null," +
                "sudut real null" +
                ");";
        String sql2 ="insert into waktu (waktu)\n" +
                "values ('15:00')," +
                " ('07:30')," +
                " ('08:05')," +
                " ('17:35')," +
                " ('11:01');";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            System.out.println("tabel sukses");
            stmt.execute(sql2);
            System.out.println("isi sukses");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        database data = new database();
        data.createNewDatabase("waktu");
        data.createNewTable();
    }
}
