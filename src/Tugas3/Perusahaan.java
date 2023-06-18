
package Tugas3;
public class Perusahaan {
    String nama,jabatan;
    int nip;
    
    //method mutator
    public Perusahaan(String nama, String jabatan, int nip){
        this.nama = nama;
        this.jabatan = jabatan;
        this.nip = nip;
    }
      
    //method accesor
    public void info(){
        System.out.println("Nama : "+nama);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("NIP : "+nip);
    }
}
