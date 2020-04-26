package Operator;

public class OperatorUnary {
    public static void main(String[] args){
        int i = 0;
        i++;                           //i tadinya 0 ditambah 1 sehingga i = 1
        System.out.println(i);          //nilai i akan jadi 1
        i++;                           //karena i tadinya sudah bernilai 1 maka sekarmg menjadi 2
        System.out.println(i);          //nilai i akan jadi 2
        i = i + 1;                      //bisa dilihat i++ sama dengani i=i+1
        System.out.println(i);         //nilai i akan menjadi 3

        i+=3;
        System.out.println(i);
        i+=3;
        System.out.println(i);
        i*=3;
        System.out.println(i);
        i*=3;
        System.out.println(i);
    }
}
