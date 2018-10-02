public class MaxElement {
    public static double isMaxElement(double[] massive)
    {
        //check empty
        if (massive.length == 0)
        {
            return Double.NaN;
        }

        double maxi = massive[0];

        for (int i = 1; i < massive.length; i++)
        {
            if (maxi < massive[i])
            {
                maxi = massive[i];
            }
        }

        return maxi;
    }
}
