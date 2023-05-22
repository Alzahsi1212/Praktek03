package praktek03;

public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        
        s.setMerk("SiLaju");
        s.setWarna("Hitam");
        s.setHarga(400000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        SepedaMotor sm = new SepedaMotor();
        sm.setMerk("H*nda");
        sm.setWarna("Putih");
        sm.setHarga(180000);
        sm.setJenisMotor("Listrik");
        sm.cetakInfo();
        System.out.println("Jenis : "+sm.getJenisMotor());
        sm.throttle();
    }
}
