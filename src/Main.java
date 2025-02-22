public class Main {
    public static void main(String[] args) {

        //Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задание 2
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задание 3
        for (int i = 0; i <= 17; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        //Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задание 5
        for (int i = 1904; i <= 2096 ; i += 4) {
            System.out.println(i +" год является високосным");
        }
        System.out.println("\n");

        //Задание 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задание 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задание 8
        int cash = 0;
        for (int i = 1; i <= 12; i++) {
            cash += 29_000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + cash);
        }
        System.out.println("\n");

        //Задание 9
        float cash1 = 0f;
        for (int i = 1; i <= 12; i++) {
            cash1 += 29_000;
            cash1 *= 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + cash1);
        }
        System.out.println("\n");

        //Задание 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
        }
        System.out.println("\n");
    }
}