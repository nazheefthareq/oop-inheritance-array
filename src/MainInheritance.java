public class MainInheritance {
    public static void main(String[] args) {
        Majalah[] magazinesArray;
        magazinesArray = new Majalah[5];

        magazinesArray[0] = new Majalah("Desain & Kreativitas", "Nami Media", "Volume 12, Edisi Maret 2024", 2024);
        magazinesArray[1] = new Majalah("Teknologi & Inovasi", "TechFuture Press", "Edisi Khusus AI, April 2023", 2023);
        magazinesArray[2] = new Majalah("Sejarah & Budaya Nusantara", "Nusantara Heritage Publishing", "Edisi 7, September 2024", 2024);
        magazinesArray[3] = new Majalah("Modern Lifestyle", "Urban Trend Media", "Volume 15, Edisi Desember 2022", 2022);
        magazinesArray[4] = new Majalah("Seni & Fotografi", "Visual Art Publishing", "Edisi Kolektor, Juli 2021", 2021);

        Buku[] booksArray;
        booksArray = new Buku[5];

        booksArray[0] = new Buku("25 Kisah Nabi dan Rasul", "Al-Ikhlas", "Ali Wafa", 2022);
        booksArray[1] = new Buku("Norwegian Wood", "Gramedia Pustaka Utama", "Haruki Murakami", 2024);
        booksArray[2] = new Buku("Bumi", "Tere Liye", "Gramedia Pustaka Utama", 2023);
        booksArray[3] = new Buku("Bulan", "Tere Liye", "Gramedia Pustaka Utama", 2023);
        booksArray[4] = new Buku("Matahari", "Tere Liye", "Gramedia Pustaka Utama", 2023);

        Skripsi[] thesisArray;
        thesisArray = new Skripsi[5];

        thesisArray[0] = new Skripsi("Pengaruh Desain Logo terhadap Brand Awareness pada Usaha Kecil dan Menengah", "Universitas Negeri Yogyakarta", "Dwi Anggraini", 2023, 0101);
        thesisArray[1] = new Skripsi("Analisis Efektivitas Penerapan AI dalam Pembuatan Desain Grafis Digital", "Institut Teknologi Bandung", "Rizky Pratama", 2021, 0101);
        thesisArray[2] = new Skripsi("Studi Etnografi Digital: Peran Media Sosial dalam Pembentukan Identitas Visual Merek", "Universitas Brawijaya", "Siti Maharani", 2024, 0101);
        thesisArray[3] = new Skripsi("Implementasi Parallax Effect dalam Game 2D Berbasis Unity untuk Pengalaman Imersif", "UPN 'Veteran' Jawa Timur", "Aditya Nugraha", 2022, 0101);
        thesisArray[4] = new Skripsi("Pengaruh Warna dalam Desain Kemasan terhadap Keputusan Pembelian Konsumen", "Universitas Padjadjaran", "Lina Setiawan", 2022, 0101);

        int index = 0;
        int indexBuku = 0;

        System.out.println("================ MAJALAH ===============");
        for (Majalah loopMajalah : magazinesArray) {
            System.out.println("========== Majalah:"+(index+1)+" =========="+loopMajalah.toString());
            index++;
        }

        indexBuku = 0;
        System.out.println("================ BUKU ===============");
        for (Buku loopBuku : booksArray) {
            System.out.println("========== Buku:"+(indexBuku+1)+" =========="+loopBuku.toString());
            indexBuku++;
        }

        index = 0;
        System.out.println("=============== SKRIPSI ================");
        for (Skripsi loopSkripsi : thesisArray) {
            System.out.println("========== Buku:"+(indexBuku+1)+" | Skripsi:"+(index+1)+" =========="+loopSkripsi.toString());
            indexBuku++;
            index++;
        }


    }
}
