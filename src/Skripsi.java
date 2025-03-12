public class Skripsi extends Buku{
    
    private int npm;

    Skripsi () {

    }

    Skripsi (String judul, String penerbit, String penulis, int tahun, int npm) {
        super(judul, penerbit, penulis, tahun);
        this.npm = npm;
    }

    public String toString() {
        return super.toString()+"\nNPM: "+npm;
    }
}
