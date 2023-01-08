import java.util.Scanner;

public class desene_gore_metot {
    public static int desen(int number, int patternNumber, int stop ){

        if(number>0){
            System.out.print(number + " ");
            return desen(number-5, patternNumber-5, stop);
        }
        if(patternNumber<=stop){
            System.out.print(patternNumber + " ");
            return desen(number, patternNumber+5, stop);
        }
        return stop;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("N sayısı: ");
        int number=sc.nextInt();
        desen(number, number, number);
    }


}
/*
package first;

import java.util.Scanner;

public class desenpatikason {
    static void pattern(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= scan.nextInt();
        int temp = number;
        do {
            temp=temp-5;
            System.out.println(temp);
        }while (temp>0);
        do {
            temp=temp+5;
            System.out.println(temp);
        }while (temp!=number);
    }
    public static void main(String[] args) {
        pattern();
    }
}
 */
