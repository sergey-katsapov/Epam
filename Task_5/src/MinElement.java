public class MinElement {
    public static double isMinElement(double[] massive)
    {
        //check empty
        if (massive.length == 0)
        {
            return Double.NaN;
        }

        double min = massive[0];

        for (int i = 1; i < massive.length; i++) {
            if (min > massive[i])
            {
                min = massive[i];
            }
        }

        return min;
    }
}
