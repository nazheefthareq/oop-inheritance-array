public class MainInheritance {
    public static void main(String[] args) {
        Majalah[] magazinesArray;
        magazinesArray = new Majalah[5];

        magazinesArray[0] = new Majalah("", "", "", 2015);
        magazinesArray[1] = new Majalah("", "", "", 2015);
        magazinesArray[2] = new Majalah("", "", "", 2015);
        magazinesArray[3] = new Majalah("", "", "", 2015);
        magazinesArray[4] = new Majalah("", "", "", 2015);

        Buku[] booksArray;
        booksArray = new Buku[5];

        booksArray[0] = new Buku("25 Kisah Nabi dan Rasul", "Al-Ikhlas", "Ali Wafa", 2022);
        booksArray[1] = new Buku("Norwegian Wood", "Gramedia Pustaka Utama", "Haruki Murakami", 2024);
        booksArray[2] = new Buku("Bumi", "Tere Liye", "Gramedia Pustaka Utama", 2023);
        booksArray[3] = new Buku("Bulan", "Tere Liye", "Gramedia Pustaka Utama", 2023);
        booksArray[4] = new Buku("Matahari", "Tere Liye", "Gramedia Pustaka Utama", 2023);

        int index = 0;

        System.out.println("================ BUKU ===============");
        for (Buku loopBuku : booksArray) {
            System.out.println("========== Buku:"+(index+1)+" =========="+loopBuku.toString());
            index++;
        }


    }
}
