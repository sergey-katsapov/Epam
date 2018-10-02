package epam.katsapov;

public class Reverses
{

        public static int reverseNumb(int a) {
            int reversedNumb = 0;
            while (a > 0) {
                reversedNumb = reversedNumb * 10 + a % 10;
                a = a / 10;
            }

            return reversedNumb;
        }
    }

