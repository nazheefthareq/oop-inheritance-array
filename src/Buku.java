public class Buku extends Koleksi{

    String penulis;

    Buku () {

    }

    Buku (String judul, String penerbit, String penulis, int tahun) {
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }

    public String toString() {
        return super.toString()+"\nPenulis: "+penulis;
    }
}
