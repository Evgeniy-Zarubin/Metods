import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {

        int year1 = 2021;
        checkYear(year1);

        int clientOS = 1;
        int deviceYear = 2018;
        checkVersion(clientOS, deviceYear);

        int delivery = checkDelivery(70);
        if (delivery != 0) {
            System.out.println("Потребуется дней: " + delivery);
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void checkYear(int year) {

        if (year > 1584) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Високосный год ещё не введён. Проверьте корректность года");
        }
    }

    public static void checkVersion(int clientOS2, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS2 == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Телефон сломан");
        }
    }

    public static int checkDelivery(int deliveryDistance) {

        int delivery = 0;
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return delivery;
        }
    }
}