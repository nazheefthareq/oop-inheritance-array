public class Majalah extends Koleksi{
    
    String edisi;

    Majalah () {

    }
    

    Majalah (String judul, String penerbit, String edisi, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }

    public String toString() {
        return super.toString()+"\nEdisi:"+edisi;
    }
}
