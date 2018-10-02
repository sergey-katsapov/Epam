public class The_third {

    public static boolean isPerfect(int a)
    {
        int count = 0;
        for (int i = 1; i < a; i++)
        {
            if (a % i == 0)
            {
                count += i;
            }
        }
        if (count == a)
        {
            return true;
        }
        return false;
    }
}
