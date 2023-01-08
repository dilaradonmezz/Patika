import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int sayi, i, total=1;
        System.out.print("Sayi giriniz: ");
        sayi=input.nextInt();

        for(i=1; i<=sayi; i++){
            total*=i;
            System.out.print(i);
            if(i!=sayi)
                System.out.print(" x ");
            else
                break;
        }
        System.out.println(" = " + total);

    }
}
