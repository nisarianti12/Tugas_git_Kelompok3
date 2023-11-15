public class Tumbuhan {
    private String nama;
    private String habitat;

    public Tumbuhan(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

class DeskripsiTumbuhan {
    public static void deskripsikanTumbuhan(Tumbuhan tumbuhan) {
        System.out.println(tumbuhan.getNama() + " adalah tumbuhan yang dapat ditemukan di " + tumbuhan.getHabitat() + ".");
    }
}
