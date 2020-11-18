package tugasinterface;

public class Singa extends Binatang implements Karnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis   : Karnivora");
        System.out.println("Makanan : Daging");
    }
    
    @Override
    public void displayBinatang(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
    }
    
    public void diplayData(){
        System.out.println("Suara        : " + this.suara);
        System.out.println("Warna Bulu   : " + this.warnaBulu);
    }
    
}
