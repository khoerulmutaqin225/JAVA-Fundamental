package pertemuan5;
import java.util.Scanner;
public class Pertemuan5 {
    public static void main(String[] args) {
//    Program Perulangan for
//    for (int hitungan = 0; hitungan <= 10; hitungan++) {
//    System.out.println("Petani Kode");
//    }
//    Program Perulangan hitung angka
//        for(int i=0; i <= 10; i++){
//            System.out.print( i + " " );
//        }
//        System.out.println( " " );

//    Program Perulangan ganjil
//        for(int i = 1; i <= 20; i += 2){
//            System.out.print( i + " ");
//        }
//        System.out.println( " " );

//    Program Perulangan foreach
//        int angka[] = {3,1,42,24,12};
//        System.out.print("Perulangan Foreach");
//
//        // menggunakan perulangan For each untuk menampilkan angka
//        for( int x : angka ){
//            System.out.print(x + " ");
//        }
//        System.out.println(" ");

//    Program Perulangan while
//        System.out.print("Perulangan while");
//
//        // menggunakan perulangan For each untuk menampilkan angka
//        boolean running = true;
//        int counter = 0;
//        String jawab;
//        Scanner scan = new Scanner(System.in);
//
//        while( running ) {
//            System.out.println("Apakah anda ingin keluar?");
//            System.out.print("Jawab [ya/tidak]> ");
//
//            jawab = scan.nextLine();
//
//            // cek jawabnnya, kalau ya maka berhenti mengulang
//            if( jawab.equalsIgnoreCase("ya") ){
//                running = false;
//            }
//
//            counter++;
//        }
//
//        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

//      Perulangan While
//        System.out.println("Perulangan while");
//
//        int i = 0;
//
//        while ( i <= 10 ){
//            // blok kode yang akan diulang
//            System.out.println("Perulangan ke-" + i);
//
//            // increment nilai i
//            i++;
//        }
//            System.out.println("Perulangan do While");
//      // membuat variabel
//        int i = 0;
//
//        do {
//            System.out.println("perulangan ke-" + i);
//            i++;
//        } while ( i <= 10);

  
        System.out.println("Perulangan Nested");
      // membuat variabel
        // membuat variabel
        int x, y;

        // melakukan parulang sebnayan x dan y kali
        for (x = 0; x <= 5; x++){
            for( y = 0; y <= 3; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
  }

}
