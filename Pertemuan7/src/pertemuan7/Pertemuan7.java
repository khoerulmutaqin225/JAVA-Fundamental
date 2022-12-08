package pertemuan7;
import java.util.HashMap;
public class Pertemuan7 {
    public static void main(String[] args) {
        // Mengenal dan memamahi HashsMap
        // membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<Integer,String>();
        
        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        
        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);

        //Mengambi hari senin
        System.out.println("Hari ke 2: " + days.get(2));
        //menghapus isi Hashmap
        days.remove(1);
        System.out.println("Isi objek days: " + days);

        days.replace(4,"Rabo");
        System.out.println("Isi objek days: " + days);



    }

}
