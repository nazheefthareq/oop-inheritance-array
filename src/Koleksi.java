public class Koleksi {

    String judul;
    String penerbit;
    int tahun;


    Koleksi () {

    }

    Koleksi (String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public String toString() {
        return "\nJudul: "+judul+"\nPenerbit: "+penerbit+"\nTahun Cetak: "+tahun; 
    }
}
