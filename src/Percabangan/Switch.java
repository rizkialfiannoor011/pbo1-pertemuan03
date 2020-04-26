package Percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {

            case 'A':
                System.out.println("Mhs     : \"Terimakasih Pak\"");
                System.out.println("Dosen   : \"Selamat yaa\"");
                break;
            case 'B':
                System.out.println("Mhs     : \"Izin bertanya pak\"");
                System.out.println("Dosen   : \"yaa silahkan\"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Ulun turun pul pak, tugas ngumpul jua kenapa dapat c?\"");
                System.out.println("Dosen   : \"Ujian Menjawab bujur lah?\"");
                System.out.println("Mhs     : \"melihat di kawan pang pa ai smalam\"");
                break;
            default:
                System.out.println("Mhs     : \"Ulun turun pul pak, tugas ngumpul jua kenapa dapat c?\"");
                System.out.println("Dosen   : \"Ujian Menjawab bujur lah?\"");
                System.out.println("Mhs     : \"melihat di kawan pang pa ai smalam\"");
                System.out.println("Dosen   : \"Yuk sini kita llihati Kartas Ujian km\"");
                System.out.println("Mhs     : \"ehee... ulun di telponi mama pak disuruh bulik.. Assalamualaikum .....\"");
                break;
        }
    }
}