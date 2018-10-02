package epam.katsapov;

public class Arithmetic_and_geometric_average {

     //арифметическое среднее
        public static double ArithmeticMean(int a) {
            int sum = 0;
            int countOfNumbers = 0;
            while (a > 0) {
                countOfNumbers++;
                int DigitalNumberCurrent = a % 10;
                sum += DigitalNumberCurrent;
                a = a / 10;
            }
            return sum / countOfNumbers;
        }


        //геометрическое среднее
        public static double GeometricMean(int a) {
            int multiplication = 1;
            int countOfNumbers = 0;
            while (a > 0) {
                countOfNumbers++;
                int DigitalNumberCurrent = a % 10;
                multiplication *= DigitalNumberCurrent;
                a = a / 10;
            }
            return Math.pow(multiplication, 1.0 / countOfNumbers);
        }
    }
