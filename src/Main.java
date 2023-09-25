import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Введите номер этажа: ");
        int floor = kb.nextInt();
        Elevator(floor);
    }
    static void Elevator(int floor)
    {
        if (floor==0)
        {
            System.out.println("Вы в подвале");
            return;
         }
         System.out.println("Вы на " + floor + " этаже");
        Elevator(floor-1);
//  System.out.println("Вы на " + floor + " этаже"); будет обратное действие, т.е. с подвала начнем подниматься до этажа floor. Смотреть можно через отладчик Run -> Ctrl + F8 (или же break point ставим слева от кода) -> Shift + F9 -> нажимаем F7 чтобы посмотреть функцию.
    }
}

*/
public class Main {
        public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите число: ");
        int fact = kb.nextInt();
        int result = factorial(fact);
        System.out.println("Факториал числа " + fact + " равен: " + result);

        System.out.print("Введите два числа: ");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double resultat = power(a, b);
        System.out.println(a + " в степени " + b + " = " + resultat);

        System.out.print("Введите предел числа Фибоначчи: ");
        int n = kb.nextInt();
        System.out.print(fibonacci(n) + " ");
    }

    public static int factorial(int fact) {
        if (fact == 1) {
            return 1;
        } else {
            return fact * factorial(fact - 1);
        }
    }

    public static double power(double a, double b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
