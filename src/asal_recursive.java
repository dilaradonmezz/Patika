import java.util.Scanner;

public class asal_recursive {
    static void asal(int a){
        int i;

        for(i=2; i<=a; i++){
            if(a%i==0 && a!=2) {
                System.out.println(a + " asal değildir.");
                break;
            }

            else {
                System.out.println(a + " asaldır.");
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a=sc.nextInt();
        asal(a);
        if(a<2)
            System.out.println(a + " asal değildir.");
    }
}
