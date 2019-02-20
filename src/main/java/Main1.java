import java.util.Scanner;

public class Main1 {

    static int methodGetFiboNumber(int n) {

        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return methodGetFiboNumber(n - 2) + methodGetFiboNumber(n - 1);
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter");
        int n = in.nextInt();
        System.out.println("\nЧисло Фибоначчи = " + methodGetFiboNumber(n));

    }

}
