public class GeometricMean {
    public static double isGeometricMean(double[] array)
    {
        double geometricMean = 1;

        for (int i = 0; i < array.length; i++)
        {
            geometricMean *= array[i];
        }
        return Math.pow(Math.abs(geometricMean), (1 / array.length));
    }
}
