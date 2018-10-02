public class Calendar {

        private final int MONTH31 = 31;
        private final int MONTH30 = 30;
        private final int MONTH29 = 29;
        private final int MONTH28 = 28;

        private int month = 0;
        private int year = 0;
        private int day = 0;


        public void setDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void tommorowDate() {

            int numDays = dayInMonth();

            if (day < numDays) {
                System.out.println("tomorrow is " + (day + 1) + "." + month + "." + year);
            } else if (day == numDays && month == 12) {
                System.out.println("tomorrow is " + 1 + "." + 1 + "." + (year + 1));
            } else if (day == numDays) {
                System.out.println("tomorrow is " + 1 + "." + (month + 1) + "." + (year + 1));
            }

        }

        private int dayInMonth() {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return MONTH31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return MONTH30;
                case 2:
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                        return MONTH29;
                    } else {
                        return MONTH28;
                    }
            }
            return 0;
        }


    }

