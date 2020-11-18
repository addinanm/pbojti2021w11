package tugasinterface;

public class Mainbinatang {
    public static void main(String[] args) {
        Keledai kl = new Keledai("hehehehe", "Abu-abu", "Keledai", 4);
        Gorilla gl = new Gorilla("haaum hauumm", "Hitam Manis", "Gorilla", 4);
        Singa sg = new Singa("Roarrr roarrr", "Coklat", "Singa", 4);
        
        kl.displayMakan();
        kl.displayBinatang();
        kl.diplayData();
        System.out.println("");
        
        gl.displayMakan();
        gl.displayBinatang();
        gl.diplayData();
        System.out.println("");
        
        sg.displayMakan();
        sg.displayBinatang();
        sg.diplayData();
        
    }
}
