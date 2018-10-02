package epam.katsapov;

public class Sum_and_product_of_digits
{

        //умножение
        public static int multiplyNumbers(int a) {
            int result = 1;
            while (a > 0) {
                int digitalNumberCurrent = a % 10;
                result *= digitalNumberCurrent;
                a = a / 10;
            }
            return result;
        }

        //сложение
        public static int addNumbers(int a) {
            int result = 0;
            while (a > 0) {
                int digitalNumberCurrent = a % 10;
                result += digitalNumberCurrent;
                a = a / 10;
            }
            return result;
        }
    }
