public class Main {
    public static void main(String[] args) {

        System.out.println("Залание 1");
        System.out.println();
            checkLeapYear();
                System.out.println();
        System.out.println("Залание 2");
        System.out.println();
        getClientOS();

    }
    public static void checkLeapYear () {
        int year=2020;
        int leapYear = year % 4;
        if (leapYear==0 && year%400==0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
    }

    }

    public static void getClientOS() {
        int clientOS = 1;
        int currentYear = 2014;
        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && currentYear < 2015){
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && currentYear < 2015){
            System.out.println("Установите полную версию приложения для IOS по ссылке");
        }

    }
}