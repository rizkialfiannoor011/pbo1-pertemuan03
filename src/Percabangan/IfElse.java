package Percabangan;

public class IfElse {
    public static void main (String[] args){
        double totalBelanja = 25000;
        double uangDiDompet = 25000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang anda kurang, Kurangi belanjaan anda");
        }else if (uangDiDompet>totalBelanja){
            System.out.println("Uang anda cukup, selamat menikmati");
        }else {
            System.out.println("Anda Membayar dengan uang pass");
        }
    }
}
