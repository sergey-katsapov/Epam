public class ArithmeticalMean {
    public static double isArithmeticalMean(double[] massive)
    {
        double arithmeticMean = 0;

        for (int i = 0; i < massive.length; i++)
        {
            arithmeticMean += massive[i];
        }
        return arithmeticMean / massive.length;
    }
}
