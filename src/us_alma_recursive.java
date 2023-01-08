import java.util.Scanner;

public class us_alma_recursive {
    static int exponential(int a, int b){
        int result=1;

        for(int i=1; i<=b; i++){
            result*=a;

        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Taban değeri girin: ");
        int a=sc.nextInt();
        System.out.print("Üs değeri girin: ");
        int b=sc.nextInt();

        if(b<0 && a>=0) {
            b = b * (-1);
            System.out.println("Sonuc: 1/" + exponential(a,b));
        }
        else if(a<0 && b<0){
            b = b * (-1);
            a = a * (-1);
            System.out.println("Sonuc: -1/" + exponential(a,b));
        }
        else
            System.out.println("Sonuc: " + exponential(a,b));
    }
}
