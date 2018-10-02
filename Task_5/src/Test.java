public class Test
{
    public static void main(String[] args)
    {

        double massive[] = {1.0, 2.0, 3.2, 4.3, 5.1,-10.1,11,-1.3,-3.3,-5.7,0,65.0};
        int massiveInt[] = {1, 2, 3, 4, 5, 6,7,8,9,10,-1,-3,-5,123};



        System.out.print("Max element:");
        System.out.println(MaxElement.isMaxElement(massive));

        System.out.print("Min element:");
        System.out.println(MinElement.isMinElement(massive));

        System.out.print("Arithmetical Mean:");
        System.out.println(ArithmeticalMean.isArithmeticalMean(massive));

        System.out.print("Geometrical Mean:");
        System.out.println(GeometricMean.isGeometricMean(massive));

        System.out.print("Ordered:");
        System.out.println(Ordered.isOrdered(massive));

        System.out.print("Max local element:");
        System.out.println(LocalMax.isLocalMax(massiveInt));

        System.out.print("Min local element:");
        System.out.println(LocalMin.isLocalMin(massiveInt));

        System.out.print("Individual:");
        System.out.println(IndividualTask.countOfPositiveElement(massiveInt));
        System.out.println(IndividualTask.sumOfElementsEqualToZero(massiveInt));

        System.out.print("Reverse:\n");


        Reverse.isReverse(massive);
        RandomInt.task1(10);


    }
}
