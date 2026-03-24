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

        /*
        System.out.println("Task 4");
        int n4 = sc.nextInt();
        System.out.println(calcfactorial(n4));
         */

        /*
        System.out.println("Task 5");
        int f = sc.nextInt();
        System.out.println(fibonumber(f));
         */

        /*
        System.out.println("Task 6");
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calcpower(a, n));
         */

        /*
        System.out.println("Task 7");
        int n = sc.nextInt();
        printReverse(n, sc);
        System.out.println();
         */

        /*
        System.out.println("Task 8");
        String s = sc.next();
        System.out.println(checkDigits(s, 0));
         */

        /*
        System.out.println("Task 9");
        String st = sc.next();
        System.out.println(countchars(st));
         */


        System.out.println("Task 10");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(findGCD(num1, num2));


    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    public static double findSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + findSum(arr, n - 1);
    }

    public static void fillArray(int[] arr, int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        fillArray(arr, n - 1, sc);
        arr[n - 1] = sc.nextInt();
    }

    public static boolean isPrime(int n, int divisor) {
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

    public static int calcfactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcfactorial(n - 1);
    }

    public static int fibonumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonumber(n - 1) + fibonumber(n - 2);
    }

    public static int calcpower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * calcpower(a, n - 1);
    }

    public static void printReverse(int n, java.util.Scanner sc) {
        if (n == 0) return;
        int num = sc.nextInt();
        printReverse(n - 1, sc);
        System.out.print(num + " ");
    }

    public static String checkDigits(String s, int index) {
        if (index == s.length()) {
            return "Yes";
        }
        char c = s.charAt(index);
        if (c < '0' || c > '9') return "No";
        return checkDigits(s, index + 1);
    }

    public static int countchars(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return 1 + countchars(s.substring(1));
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
