public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }

        System.out.println("Задача № 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }

        System.out.println("Задача № 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Четное число " + i);
        }

        System.out.println("Задача № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }

        System.out.println("Задача № 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + "год является високосным.");
        }

        System.out.println("Задача № 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача № 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача № 8");
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача № 9");
        int deposit1 = 29000;
        int total1 = 0;
        for (int month1 = 1; month1 <= 12; month1++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + deposit1;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей.");
        }

        System.out.println("Задача № 10");
        for (int factor = 1; factor <= 10; factor++) {
            System.out.println("2 * " + factor + " = " + 2 * factor);
    }

}
}