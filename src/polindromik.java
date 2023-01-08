public class polindromik {
    static boolean isPalindrom(int number){
        int temp=number, reversenumber=0, lastnumber;
        while(temp!=0){

            System.out.println("sayı-->" + temp);
            lastnumber=temp%10;

            System.out.println("son basamak-->" + lastnumber);
            reversenumber=reversenumber*10 + lastnumber;

            System.out.println("yeni sayı-->" + reversenumber);
            temp/=10;

            System.out.println("----------------------------");
        }
        if(temp==reversenumber)
            return true;
        else
            return false;
    }

    /* kullanıcıdan b değerini alır
    for (int i = 0; i <=b ; i++) {
            int c= f(i);
            if (i==c) {
                System.out.println(i);

            } else {continue;

            }

        }
     */
    public static void main(String[] args){
        System.out.println(isPalindrom(535));
    }
}
