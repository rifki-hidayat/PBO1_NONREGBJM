
package Tugas4;

class Anak1 extends Anak{
    private int umur;
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public int getUmur(){
        return umur;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Umur : "+umur);
    }


}
