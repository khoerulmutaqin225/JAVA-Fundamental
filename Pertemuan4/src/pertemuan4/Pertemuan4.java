package pertemuan4;
import java.util.Scanner;
public class Pertemuan4 {
    public static void main(String[] args) {
        // Program Percabangan
//        System.out.println("Program Percabangan");
//        // membuat variabel belanja dan scanner
//        int belanja = 0;
//        Scanner scan = new Scanner(System.in);
//
//        // mengambil input
//        System.out.print("Total Belanjaan: Rp ");
//        belanja = scan.nextInt();
//
//        // cek apakah dia belanja di atas 100000
//        if ( belanja > 100000 ) {
//            System.out.println("Selamat, anda mendapatkan hadiah!");
//        }
//        System.out.println("Terima kasih...");

        // Program Percabangan
//        System.out.println("Program Percabangan IF Else");
//       // membuat variabel dan Scanner
//        int nilai;
//        String nama;
//        Scanner scan = new Scanner(System.in);
//        // mengambil input
//        System.out.print("Nama: ");
//        nama = scan.nextLine();
//        System.out.print("Nilai: ");
//        nilai = scan.nextInt();
//
//        // cek apakah dia lulus atau tidak
//        if( nilai >= 70 ) {
//            System.out.println("Selemat " + nama + ", anda lulus!");
//        } else {
//            System.out.println("Maaf " + nama + ", anda gagal");
//        }

//        Program Percabangan
//        System.out.println("Program Tennary ");
//        boolean suka = true;
//        String jawaban;
//
//        // menggunakan operator ternary
//        jawaban = suka ? "iya" : "tidak";
//
//        // menampilkan jawaban
//        System.out.println(jawaban);
//

//        Program Switch Case
//        Membuat variabel dan scanner

//        int nilai;
//        String grade;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Program If Else");
//        // mengambil input
//        System.out.print("Inputkan nilai: ");
//        nilai = scan.nextInt();
//
//        // higung gradenya
//        if ( nilai >= 90 ) {
//            grade = "A";
//        } else if ( nilai >= 80 ){
//            grade = "B+";
//        } else if ( nilai >= 70 ){
//            grade = "B";
//        } else if ( nilai >= 60 ){
//            grade = "C+";
//        } else if ( nilai >= 50 ){
//            grade = "C";
//        } else if ( nilai >= 40 ){
//            grade = "D";
//        } else {
//            grade = "E";
//        }
//
//        // cetak hasilnya
//        System.out.println("Grade: " + grade);
        
//        System.out.println("Program Swith Case");
        
//      membuat variabel dan Scanner
//        String lampu;
//        Scanner scan = new Scanner(System.in);
//
//        // mengambil input
//        System.out.print("Inputkan nama warna: ");
//        lampu = scan.nextLine();
//
//        switch(lampu){
//            case "merah":
//                System.out.println("Lampu merah, berhenti!");
//                break;
//            case "kuning":
//                System.out.println("Lampu kuning, harap hati-hati!");
//                break;
//            case "hijau":
//                System.out.println("Lampu hijau, silahkan jalan!");
//                break;
//            default:
//                System.out.println("Warna lampu salah!");
//        }
//

        
        System.out.println("Program Kasir Sederhana");

 // deklarasi variabel dan Scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        // proses
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }

        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }

        // total yang harus dibayar
        bayar = belanjaan - diskon;

        // output
        System.out.println("Total Bayar: Rp " + bayar);

    }

}
