
package tugas2;
public class PerusahaanHasnur {
    public static void main(String[] args) {
        //membuat objek
        Perusahaan perusahaansatu = new Perusahaan();
        Perusahaan perusahaandua = new Perusahaan();
        
        //membuat nilai atribut
        perusahaansatu.nama = "Rifki";
        perusahaansatu.jabatan = "Manager";
        perusahaansatu.nip = 12345;
        perusahaandua.nama = "Faisal";
        perusahaandua.jabatan = "Karyawan";
        perusahaandua.nip = 54321;
        
        //memanggil atribut
        System.out.println("Nama : "+perusahaansatu.nama);
        System.out.println("Jabatan : "+perusahaansatu.jabatan);
        System.out.println("NIP : "+perusahaansatu.nip);
        System.out.println("Nama : "+perusahaandua.nama);
        System.out.println("Jabatan : "+perusahaandua.jabatan);
        System.out.println("NIP : "+perusahaandua.nip);
    }
    
}
