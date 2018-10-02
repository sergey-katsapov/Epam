import epam.katsapov.*;


public class Test {
    public static void main(String[] args) {


        System.out.println("_________________________#1 MASS OF DINOSAUR_______________________________");
        double weight = 31.6;
        double weightGramm = Mass_of_a_dinosaur.convertGramm(weight);
        double weightTon = Mass_of_a_dinosaur.convertTon(weight);
        double weightMgramm = Mass_of_a_dinosaur.convertMilligram(weight);
        System.out.printf("%.1f kg =  %.1f gram,\n" +
                          " = %.4f ton,\n" +
                          " = %.1f Milligram.\n", weight, weightGramm, weightTon, weightMgramm);
        System.out.println("\n");




        System.out.println("_________________________#2 AREA OF RING___________________________________");
        double radiusTheFirst = 12;
        double radiusTheSecond = 6;
        double area = Area_of_the_ring.RingArea(radiusTheFirst, radiusTheSecond);
        System.out.println("Area of ring:  " + Double.toString(area));
        System.out.println("\n");




        System.out.println("_________________________#3 SWAP 2 NUMBERS_________________________________");
        int firstNumb = 1;
        int secondNumb = 2;
        Swaps_the_contents swapper = new Swaps_the_contents(firstNumb, secondNumb);
        System.out.println("Before " + swapper.toString());
        swapper.swapInt();
        System.out.println("After " + swapper.toString());
        System.out.println("\n");




        System.out.println("_______________________#4  INCREASE(true/false)____________________________");
        int sequence = 97531;
        boolean increase = Checks_the_sequence.increaseSequence(sequence);
        System.out.println("Is increase? :  " + increase);
        System.out.println("\n");




        System.out.println("_______________________#5  MULTIPLICATION & SUM __________________________");
        int numb = 1332;
        int sum = Sum_and_product_of_digits.addNumbers(numb);
        int multiplication = Sum_and_product_of_digits.multiplyNumbers(numb);
        System.out.println("Sum: " + sum + "\n" +
                           "Multiplication: " + multiplication);
        System.out.println("\n");




        System.out.println("____________________#6 GEOMETRIC & ARITHMETIC MEAN________________________");
        double c = Arithmetic_and_geometric_average.GeometricMean(numb);
        System.out.println("Geometric mean: " + c);
        c = Arithmetic_and_geometric_average.ArithmeticMean(numb);
        System.out.println("Arithmetic mean: " + c);
        System.out.println("\n");




        System.out.println("__________________________________#7 REVERS________________________________");
        int numberReverse = 123456789;
        System.out.println("Before: " + numberReverse);
        numberReverse = Reverses.reverseNumb(numberReverse);
        System.out.println("After: " + numberReverse);
        System.out.println("\n");
    }
}
