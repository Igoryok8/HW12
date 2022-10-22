public class Main {
    public static void main(String[] args) {

        System.out.println("Залание 1");
        System.out.println();
        checkLeapYear();

    }
    public static void checkLeapYear () {
        int year= 2000;
        int leapYear = year % 4;
        if (leapYear==0 && year%400==0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");

        }
    }

}