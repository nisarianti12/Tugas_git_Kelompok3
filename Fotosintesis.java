interface Fotosintesis {
    void lakukanFotosintesis();
}

interface Respirasi {
    void lakukanRespirasi();
}

interface Reproduksi {
    void berkembangBiak();
}

class BungaMatahari extends Bunga implements Fotosintesis, Reproduksi {
    public BungaMatahari(String nama, String habitat, String warna) {
        super(nama, habitat, warna);
    }

    @Override
    public void lakukanFotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis di bawah cahaya matahari.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan cara penyerbukan.");
    }
}

class PohonMangga extends Pohon implements Fotosintesis, Respirasi, Reproduksi {
    public PohonMangga(String nama, String habitat, double tinggi) {
        super(nama, habitat, tinggi);
    }

    @Override
    public void lakukanFotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis dengan daunnya.");
    }

    @Override
    public void lakukanRespirasi() {
        System.out.println(getNama() + " bernapas untuk mendapatkan energi.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan menghasilkan biji.");
    }
}

class PakuRakit extends Paku implements Fotosintesis, Reproduksi {
    public PakuRakit(String nama, String habitat, String tipeSpora) {
        super(nama, habitat, tipeSpora);
    }

    @Override
    public void lakukanFotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis di bawah sinar matahari.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan cara spora.");
    }
}

class KaktusBarel extends Kaktus implements Respirasi, Reproduksi {
    public KaktusBarel(String nama, String habitat, String jenisDuri) {
        super(nama, habitat, jenisDuri);
    }

    @Override
    public void lakukanRespirasi() {
        System.out.println(getNama() + " melakukan respirasi untuk bertahan di habitat kering.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan menghasilkan bunga.");
    }
}

class LumutTanduk extends Lumut implements Fotosintesis, Respirasi, Reproduksi {
    public LumutTanduk(String nama, String habitat, double lajuPertumbuhan) {
        super(nama, habitat, lajuPertumbuhan);
    }

    @Override
    public void lakukanFotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis untuk menghasilkan makanan.");
    }

    @Override
    public void lakukanRespirasi() {
        System.out.println(getNama() + " melakukan respirasi untuk mendapatkan energi.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan cara spora atau tumbuhan anak.");
    }
}
