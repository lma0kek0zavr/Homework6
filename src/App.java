import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Задание №1
        Scanner yearScanner = new Scanner(System.in);

        int year;

        System.out.print("Укажите год: ");

        year = yearScanner.nextInt();

        isLeapYear(year);

        //Задание №2

        Scanner deviceScanner = new Scanner(System.in);

        int deviceOS;
        
        int clientDeviceYear;
            
        System.out.print("Какое у вас устройство (0 - iOS, 1 - Android)?: ");
        deviceOS = deviceScanner.nextInt();

        System.out.print("\nУкажите год выпуска вашего устройства: ");
        clientDeviceYear = deviceScanner.nextInt();

        appVersion(deviceOS, clientDeviceYear);
        
        //Задание №3

        Scanner distanceScanner = new Scanner(System.in);

        int deliveryDistance;

        System.out.print("\nВведите расстояние в километрах: ");

        deliveryDistance = distanceScanner.nextInt();

        calculateDeliveryTime(deliveryDistance);
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%d год - високосный год", year);
        } else {
            System.out.printf("%d год - невисокосный год", year);
        }
    }

    public static void appVersion(int deviceOS, int year) {
        int currentYear = LocalDate.now().getYear();

        if (deviceOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (deviceOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (deviceOS == 0 && year >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (deviceOS == 1 && year >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Неизвестное устройство!");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) { 
        int defaultDeliverytime = 1;

        if (deliveryDistance < 20) { 
            System.out.printf("Потребуется дней: %d", defaultDeliverytime);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) { 
            System.out.printf("Потребуется дней: %d", defaultDeliverytime + 1);
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) { 
            System.out.printf("Потребуется дней: %d", defaultDeliverytime + 2);
        }
        else {
            System.out.println("Доставки нет");
        }
    }
}
