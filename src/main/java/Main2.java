import java.util.Scanner;

public class Main2 {

    static Long methodGetFiboNumber(long n) {

        long[] arrayFibo = new long[(int) (n + 1)];
        arrayFibo[0] = 0;
        arrayFibo[1] = 1;
        for(int i = 2; i <= n; i++) {
            arrayFibo[i] = arrayFibo[i - 1] + arrayFibo[i - 2];
        }
        return arrayFibo[(int) n];

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter");
        long n = in.nextInt();
        System.out.println("\nЧисло Фибоначчи = " + methodGetFiboNumber(n));

    }

}
