import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Task 1");
        int n = sc.nextInt();
        printDigits(n);
        sc.close();
         */

        /*
        System.out.println("Task 2");
        int size = sc.nextInt();
        int[] arr = new int[size];
        fillArray(arr, size, sc);
        double totalSum = findSum(arr, size);
        double average = totalSum / size;
        System.out.println(average);
        sc.close();
         */

        /*
        System.out.println("Task 3");
        int num = sc.nextInt();
        if(isPrime(num, 2)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
        sc.close();
         */


    }
public static void printDigits(int n) {
    if (n < 10) {
        System.out.println(n);
        return;
    }
    printDigits(n / 10);
    System.out.println(n % 10);
    }

    public static double findSum(int[] arr, int n){
        if (n <=0 ){
            return 0;
        }
        return arr[n-1] + findSum(arr, n-1);
    }
    public static void fillArray(int[] arr, int n, Scanner sc){
        if (n<=0){
            return;
        }
        fillArray(arr, n-1, sc);
        arr[n-1] = sc.nextInt();
    }

    public static boolean isPrime (int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor == n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }

    public static
}