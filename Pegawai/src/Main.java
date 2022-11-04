import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {



        Pegawai rio = new Pegawai();

        System.out.println("Pegawai");
        rio.setNama("Rio Saputra");
        rio.setGajiPokok(1000000.0);
        rio.cetakInfo();

        System.out.println("--------------------------");

        System.out.println("Manager");
        Manager rehan = new Manager();
        rehan.setNama("Rehan Pratama");
        rehan.setTunjangan(4000000.0);
        rehan.setGajiPokok(1000000.0);
        rehan.cetakInfo();
        rehan.cetakTunjangan();

        System.out.println("---------------------------");

        System.out.println("Programmer");
        Programmer riko = new Programmer();
        riko.setNama("riko simanjuntak");
        riko.setBonus(5000000.0);
        riko.setGajiPokok(1000000.0);
        riko.cetakInfo();
        riko.cetakbonus();

    }

}