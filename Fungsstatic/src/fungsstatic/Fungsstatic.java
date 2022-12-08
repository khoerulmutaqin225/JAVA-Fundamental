package fungsstatic;
public class Fungsstatic {
    public void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
    
    // fungsi static
    public static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }
    
    // fungsi main
    public static void main(String[] args) {
        
        // pemanggilan fungsi static
        minum("Kopi");
        
        
        // mambuat instansiasi objek saya dari class FungsiStatic
        Fungsstatic saya = new Fungsstatic();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");
        
    }
}
