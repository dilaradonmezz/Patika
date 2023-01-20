import java.util.Scanner;
import java.util.Arrays;
public class En_yakin_min_max {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int sayi, min=100000000, max=0, fark=0, fark2=0;
        int [] arr= {15,12,788,1,-1,-778,2,0};
        System.out.print("Sayı girin: ");
        sayi = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(arr));
        //[-778, -1, 0, 1, 2, 12, 15, 788]

        for(int i :arr){
            if(i<=min)
                min=i;
            if(i>=max)
                max=i;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


        for(int i:arr){
            if(i<sayi)
                fark=sayi-i;
            if(i>sayi){
                fark2=i-sayi;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (sayi-fark));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (sayi+fark2));

        //Diğer Yöntemler
      /*

        int minv=arr[0];
        int maxv=arr[arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=sayi && arr[i]>minv)
               minv=arr[i];
            if(arr[i]>=sayi && arr[i]<maxv) ****
               maxv=arr[i];

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minv);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxv);
      */

        /*
        int infumum =min;
        int supremum=max;
        for(int i: arr){
            if(i<sayi)
                infumum=(sayi-infumum < sayi-i) ? infumum : i;
            if(i>sayi)
                supremum=(supremum-sayi<i-sayi) ? supremum : i;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + infumum);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + supremum);

         */

        /*
        int minListElement=Integer.MAX_VALUE;
        int maxListElement=Integer.MIN_VALUE;

        int[] tempArray= Arrays.copyOf(arr, arr.length);
        Arrays.sort(tempArray); //[-778, -1, 0, 1, 2, 12, 15, 788]
        for(int i=0; i<tempArray.length; i++){
            if(sayi-tempArray[i] <= 0){
                maxListElement=tempArray[i];
                minListElement=tempArray[i-1];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minListElement);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxListElement);

         */
    }
}