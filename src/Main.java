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
        int deliveryDays;
        System.out.println("Задача 3");
        for (int i = 15; i < 120; i += 30) {
            deliveryDays = countingDeliveryDays(i);
            if (deliveryDays != 0) System.out.println("Потребуется дней: " + deliveryDays);
            else System.out.println("Доставка не осуществляется");

        }
    }
    public static int countingDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
        } else {
            return deliveryDays;
        }
        return deliveryDays;
    }
}