public class Date {

        public static final int JANUARY = 1;
        public static final int MARCH = 3;
        public static final int MAY = 5;
        public static final int JULY = 7;
        public static final int AUGUST = 8;
        public static final int OCTOBER = 10;
        public static final int DECEMBER = 12;

        public static String changeDate(int day, int month, int year) {
            if (day <= 27) {
                day++;
            } else if (day == 28) {
                if ((month != 2) || ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    day++;
                } else {
                    month++;
                    day = 1;
                }
            } else if (day == 29) {
                if (month != 2) {
                    day++;
                } else {
                    month++;
                    day = 1;
                }
            } else if (day == 30) {
                if ((month == JANUARY) || (month == MARCH) || (month == MAY) || (month == JULY)
                        || (month == AUGUST) || (month == OCTOBER) || (month == DECEMBER)) {
                    day++;
                } else {
                    month++;
                    day = 1;
                }
            } else {
                if (month != DECEMBER) {
                    month++;
                    day = 1;
                } else {
                    year++;
                    month = 1;
                    day = 1;
                }
            }
            String res = new String(day + "." + month + "." + year);
            return res;
        }
}
