public class Pohon extends Tumbuhan {
    private double tinggi;

    public Pohon(String nama, String habitat, double tinggi) {
        super(nama, habitat);
        this.tinggi = tinggi;
    }

    public void describePlant() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Tinggi: " + this.tinggi + " meter");
    }

    public double getTinggi() {
        return tinggi;
    }

    public void lakukanFotosintesis() {
        System.out.println("Pohon sedang melakukan fotosintesis...");
    }

    public void lakukanRespirasi() {
        System.out.println("Pohon sedang melakukan respirasi...");
    }

    public void reproduksi() {
        System.out.println("Pohon sedang mereproduksi...");
    }

    public void berkembangBiak() {
        System.out.println("Pohon sedang berkembang biak dengan cara tertentu");
    }
}
