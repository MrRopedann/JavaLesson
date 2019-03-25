import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Добро пожаловать!");
        System.out.println("Вы запустили Простой калькулятор. Он умеет выполнять математические операции  с двумя числами");
        System.out.println("И так приступим...\n");
        System.out.println("Введите вариант опирации которую хотите совершить.");

        while (true) {
            System.out.println("\n1) Сложение");
            System.out.println("2) Вычитание");
            System.out.println("3) Умножение");
            System.out.println("4) Деление");
            System.out.println("0) Выход");

            BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
            int option = Integer.parseInt(reader.readLine());

            if (option == 1) {
                System.out.println("Введите значение первого числа.");
                BufferedReader readerA  = new BufferedReader(new InputStreamReader(System.in));
                double a = Double.parseDouble(readerA.readLine());
                System.out.println("Введите значение второго числа.");
                BufferedReader readerB  = new BufferedReader(new InputStreamReader(System.in));
                double b = Double.parseDouble(readerB.readLine());
                System.out.print("A + B = ");
                System.out.printf("%.2f", (a+b));
            }
            else if (option == 2) {
                System.out.println("Введите значение первого числа.");
                BufferedReader readerA  = new BufferedReader(new InputStreamReader(System.in));
                double a = Double.parseDouble(readerA.readLine());
                System.out.println("Введите значение второго числа.");
                BufferedReader readerB  = new BufferedReader(new InputStreamReader(System.in));
                double b = Double.parseDouble(readerB.readLine());
                System.out.print("A - B = ");
                System.out.printf("%.2f", (a-b));
            }
            else if (option == 3) {
                System.out.println("Введите значение первого числа.");
                BufferedReader readerA  = new BufferedReader(new InputStreamReader(System.in));
                double a = Double.parseDouble(readerA.readLine());
                System.out.println("Введите значение второго числа.");
                BufferedReader readerB  = new BufferedReader(new InputStreamReader(System.in));
                double b = Double.parseDouble(readerB.readLine());
                System.out.print("A x B = ");
                System.out.printf("%.2f", (a*b));
            }
            else if (option == 4) {
                System.out.println("Введите значение первого числа.");
                BufferedReader readerA  = new BufferedReader(new InputStreamReader(System.in));
                double a = Double.parseDouble(readerA.readLine());
                System.out.println("Введите значение второго числа.");
                BufferedReader readerB  = new BufferedReader(new InputStreamReader(System.in));
                double b = Double.parseDouble(readerB.readLine());
                System.out.print("A / B = ");
                System.out.printf("%.2f", (a/b));
            }
            else if (option == 0) {
                break;
            }
        }
    }
}
