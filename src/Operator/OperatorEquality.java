package Operator;

public class OperatorEquality {
    public static void main (String[] args){
        int i = 5;
        int j = 6;
        System.out.println(i==5); //ture
        System.out.println(i==6); //false
        System.out.println(i==j); //false
        System.out.println(i>j);  //false
        System.out.println(i<j);  //ture
        System.out.println(5>6);  //false
        System.out.println(5<6);  //true
        System.out.println(i!=5); //false
        System.out.println(j!=5); //true
    }
}