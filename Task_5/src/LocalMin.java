public class LocalMin {
    public static int isLocalMin(int[] mas)
    {

        int position = -1;

        for (int i = 1; i < mas.length - 1; i++)
        {
            if ((mas[i] < mas[i - 1]) && (mas[i] < mas[i + 1]))
                return i;
        }
        return position;
    }
}
