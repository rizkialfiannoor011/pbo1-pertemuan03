package Percabangan;

public class Switch {
    public static void main ( String[] args){
        int JalanJalan = 3;
        switch (JalanJalan){
            case 1:
                System.out.println("makan Bakso");
                break;
            case 2:
                System.out.println("makan Sate");
                break;
            case 3:
                System.out.println("makan Ayam Goreng ");
                break;
            case 4:
                System.out.println("minum Es Jeruk");
                break;
            case 5:
                System.out.println("minum Teh Es");
                break;
            default:
                System.out.println("Sudah Makan");
                break;
        }
    }
}
