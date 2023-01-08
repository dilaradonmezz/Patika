import java.util.Scanner;

public class fibonacci_metotla {
    static int fibo(int i){

        if(i==1 || i==2)
            return 1;
        else
            return fibo(i-1)+fibo(i-2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Fibonacci terimini girin: ");
        int fib=sc.nextInt();
        System.out.println("Fibonacci değeri: "+fibo(fib));
    }
}
/*
import java.util.Scanner;

public class FibonacciSequence {
    static int fibonacciCalculator(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacciCalculator(number - 1) + fibonacciCalculator(number - 2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i;
        do {
            System.out.print("The number of elements of the sequence: ");
            number = scanner.nextInt();
            for (i = 1; i <= number; i++) {
                System.out.print(fibonacciCalculator(i) + " ");
            }
            System.out.println();
        } while (number > 0);
    }
}
 */