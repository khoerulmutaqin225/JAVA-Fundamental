package prosedurfungsi;
public class ProsedurFungsi {
    //Methode
    static void ucapSalam(){
    System.out.println("selamat Pagi");
    }
    
   //Fungsi dengan Parameter
    static void ucapin(String ucapan){
        System.out.println(ucapan);
    }

    
   //Fungsi dengan pembalik ilai
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
 
    public static void main(String[] args) {
//      Methode Biasa
//      ucapSalam();
//      Fungsi dengan Parameter
//      ucapin("Hallo!");
//      ucapin("Selamat datang di pemrograman Java");
//      ucapin("Saya kira ini bagian terakhir");
//      ucapin("Sampai jumpa lagi, ya!");
        
//      Fungsi dengan nilai pembalik
        System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + luasPersegi(5));



    

    }

}
