public class Kaktus extends Tumbuhan {
    private String jenisDuri;

    public Kaktus(String nama, String habitat, String jenisDuri) {
        super(nama, habitat);
        this.jenisDuri = jenisDuri;
    }

    public void describePlant() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Jenis Duri: " + this.jenisDuri);
    }

    public String getJenisDuri() {
        return jenisDuri;
    }

    public void lakukanFotosintesis() {
        System.out.println("Kaktus sedang melakukan fotosintesis...");
    }

    public void lakukanRespirasi() {
        System.out.println("Kaktus sedang melakukan respirasi...");
    }

    public void reproduksi() {
        System.out.println("Kaktus sedang mereproduksi...");
    }

    public void berkembangBiak() {
        System.out.println("Kaktus sedang berkembang biak dengan cara tertentu");
    }
}
