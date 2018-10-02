public class Reverse {
    public static void isReverse(double[] massive)
    {
        for (int i = 0; i < massive.length / 2; i++)
        {
            double tmp = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = tmp;

        }
        for (int i = 0; i < massive.length; i++)
        {
            System.out.println(massive[i]);
        }
    }
}
