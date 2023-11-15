public class Paku extends Tumbuhan {
    private String tipeSpora;

    public Paku(String nama, String habitat, String tipeSpora) {
        super(nama, habitat);
        this.tipeSpora = tipeSpora;
    }

    public void describePlant() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Tipe Spora: " + this.tipeSpora);
    }

    public String getTipeSpora() {
        return tipeSpora;
    }

    public void lakukanFotosintesis() {
        System.out.println("Paku sedang melakukan fotosintesis");
    }

    public void lakukanRespirasi() {
        System.out.println("Paku sedang melakukan respirasi");
    }

    public void reproduksi() {
        System.out.println("Paku sedang mereproduksi");
    }

    public void berkembangBiak() {
        System.out.println("Paku sedang berkembang biak dengan cara tertentu");
    }
}
