public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int year = 2000; year < 2101; year++) {
            System.out.println(year + " год " + (checkLeapYear(year) ? "" : "------ не ") + "является високосным");
        }
    }
    public static boolean checkLeapYear(int year) {
        return  (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 2014; j < 2020; j += 5) {
                System.out.println(choiceVersion( i, j));
            }
        }
    }
    public static String choiceVersion(int clientOS, int clientDeviceYear) {
        String version;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) version = "Установите версию приложения для iOS по ссылке";
            else version = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) version = "Установите версию приложения для Android по ссылке";
            else version = "Установите облегченную версию приложения для Android по ссылке";
        } else {
            version = "Ошибка ввода данных, переменная clientOS может принимать только два значения 0 или 1";
        }
        return version;
    }
    public static void task3() {
        System.out.println("Задача 3");
    }
}