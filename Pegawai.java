public class Pegawai {
    private String nama;
    private double gajiPokok;
    public Pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void cetakInfo(){
        System.out.println("NAMA\t\t: " + this.getNama());
        System.out.println("GAJI POKOK\t: " + this.getGajiPokok());

    }
}
