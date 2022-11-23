public class Manager extends Pegawai{
    private double tunjangan;
    /* CONSTRUCTOR */
    public Manager(String nama, double gajiPokok, double tunjangan){
        super(nama,gajiPokok);
        this.tunjangan = tunjangan;
    }

    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double getTunjangan(){
        return this.tunjangan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("TUNJANGAN\t: " + this.getTunjangan());
    }
}
