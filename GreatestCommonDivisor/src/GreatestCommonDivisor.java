public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int greatestDivisor = 0;
        if (first < second) {
            for (int i = 1; i <= first; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    if (greatestDivisor < i) {
                        greatestDivisor = i;
                    }
                }
            }
        } else {
            for (int i = 1; i <= second; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    if (greatestDivisor < i) {
                        greatestDivisor = i;

                    }
                }
            }
        }
        return greatestDivisor;
    }
}