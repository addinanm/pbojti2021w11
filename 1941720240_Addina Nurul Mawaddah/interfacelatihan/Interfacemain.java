package interfacelatihan;

public class Interfacemain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
//        Mahasiswa mahasiswaBiasa = new
//        Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCum  = new PascaSarjana("Elok");
        
//        PascaSarjana("Elok");
        // pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
       // pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatMawapres(masterCum);
}
}
