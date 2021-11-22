public class Main {

    public static void main(String[] args) {

       boolean isLeapYear = LeapYear.isLeapYear(-1600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2017);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1924);
        System.out.println(isLeapYear);
    }
}
