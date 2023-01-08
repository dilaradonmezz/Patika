import java.util.Scanner;

public class metotla_hesap_makinesi {

    static int sum(int a, int b){
        int result=a+b;
        System.out.println("Toplama İşlemi--> " +a +" + " + b +" = " + result);
        return result;
    }
    static int minus(int a, int b){
        int result=a-b;
        System.out.println("Çıkarma İşlemi--> "+a +" - " + b +" = " + result);
        return result;
    }
    static int times(int a, int b){
        int result=a*b;
        System.out.println("Çarpma İşlemi--> "+a +" * " + b +" = " + result);
        return result;
    }
    static int divide(int a, int b){
        int result=a/b;
        if(b!=0)
            System.out.println("Bölme İşlemi--> "+a +" / " + b +" = " + result);
        else
            System.out.println("Bölünen sayı 0 olamaz.");
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        System.out.println("Üslü Sayı Hesaplama--> "+a +" üssü " + b +" = " + result);
        return result;
    }

    static int mod(int a, int b){
        int result=a%b;

        return result;
    }
    static void rectangle(int a, int b){
        int result_area=a*b, result_perimeter=2*(a+b);
        System.out.println("Dikdörtgen Alanı -->" +result_area + "Dikdörtgen Çevresi --> "+ result_perimeter);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String menu= "1- Toplama İşlemi\n"+
                "2- Çıkarma İşlemi\n"+
                "3- Çarpma İşlemi\n"+
                "4- Bölme İşlemi\n"+
                "5- Üslü Sayı Hesaplama\n"+
                "6- Mod Alma\n"+
                "7- Dikdörtgen Alan ve Çevre Hesabı\n"+
                "8- Çıkış Yap\n"+
                "9- Menüye Dön\n";

        int select, a, b;
        System.out.println(menu);
        while(true){
            System.out.print("Menüden işlem seçin: ");
            select=sc.nextInt();
            System.out.print("Sayıları girin: ");
            a=sc.nextInt();
            b=sc.nextInt();

            if(select==8)
                break;

            switch(select){
                case 1:
                    sum(a,b);
                    break;

                case 2:
                    minus(a,b);
                    break;

                case 3:
                    times(a,b);
                    break;

                case 4:
                    divide(a,b);
                    break;

                case 5:
                    power(a,b);
                    break;

                case 6:
                    System.out.println("Mod Alma--> "+a +" % " + b +" = " + mod(a,b));
                    break;

                case 7:
                    rectangle(a,b);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem seçtiniz.");
            }
        }

    }
}
