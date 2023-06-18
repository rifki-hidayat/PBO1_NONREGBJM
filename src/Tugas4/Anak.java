
package Tugas4;

public class Anak {
    private String nama;
    
    public void setNama (String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void info(){
        System.out.println("Nama :"+nama);
    }
}
