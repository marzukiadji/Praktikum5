public class PegawaiBeraksi {
    public static void main(String[] args){
        // Membuat Object dengan Constructor
        //* PRAKTIKUM 5 MEMBUAT CONSTRUCTOR */
        Pegawai adjie = new Manager("Adji Marzuki",5000000,1000000);
        Pegawai syahril = new Programmer("Syahril Ifanda",4000000,400000);

        // /* TUGAS PADA PRAKTIKUM 3 YANG MASIH MENGGUNAKAN SETTER DAN GETTER */
        // adjie.setNama("Adji Marzuki");
        // adjie.setGajiPokok(5000000);
        // adjie.setTunjangan(1000000);

        // syahril.setNama("Syahril Ifanda");
        // syahril.setGajiPokok(4000000);
        // syahril.setBonus(400000);

        /*Mengakses Method*/
        adjie.cetakInfo();
        System.out.println();
        syahril.cetakInfo();
    }
}
