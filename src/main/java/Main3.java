import java.util.Scanner;

public class Main3 {

    static Long methodGetFiboNumber(long n) {

        return n < 3 ? n : (methodGetFiboNumber(n - 2) + methodGetFiboNumber(n - 1));

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter");
        long n = in.nextInt();
        System.out.println("\nЧисло Фибоначчи = " + methodGetFiboNumber(n));

    }

}
