import java.math.BigInteger;//µº»Î¿‡
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRecursive {  
  
    public static void main(String[] arg) {  
        Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();  
        System.out.println(factorial(n));  
    } 
    private static long factorial(int n) {  
        if (n == 0) {  
            System.out.println(n + "! = " + 1);  
            return 1;  
        } else {  
            long num = n * factorial(n - 1);  
            System.out.println(n + "! = " + num);  
            return num;  
        }  
    }
}