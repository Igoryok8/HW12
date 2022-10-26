public class Main {
    public static void main(String[] args) {

        System.out.println("Залание 1");
        System.out.println();
        printLeapYear(1900);
        System.out.println();

        System.out.println("Залание 2");
        System.out.println();
        getClientOS(0,2012);
        System.out.println();

        System.out.println("Залание 3");
        System.out.println();
        calculateDeliveryDays(102);
    }
    public static void printLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printLeapYearResult(year,leapYear);
        }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 400 == 0||year % 100!=0;
    }
    private static void printLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }



    public static void getClientOS(int clientOS,int currentYear) {

        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && currentYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите полную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && currentYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }

    }
    public static void calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays++;
        }else{
            System.out.println("Не возможно расчитать срок доставки");
        }
                System.out.println("Потребуется дней: " +deliveryDays);
            }
    }