public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            boolean leapYear =
                    ((year % 4 == 0) ?
                            ((year % 100 == 0) ?
                                    ((year % 400 == 0) ? true
                                    : false)
                            : true)
                    : false);
            return leapYear;
        }else {
            return false;
        }
    }
}
