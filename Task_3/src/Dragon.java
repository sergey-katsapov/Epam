public class Dragon {

    private final int DRAGON_AGE = 0;
    private final int START_HEAD = 3;
    private final int DRAGON_AGE_2 = 200;
    private final int DRAGON_ALL_HEADS = 600;
    private final int YOUNG_HEAD = 2;
    private final int OLD_AGE = 300;
    private final int OLD_ALL_HEADS = 800;
    private final int OLD_HEAD = 1;

    private int head = 0;

    public int headNumber(int year) {

        if (year > DRAGON_AGE)
        {
            if (year <= DRAGON_AGE_2)
            {
                return head = year * START_HEAD;
            }
            else if (year <= OLD_AGE)
            {
                return head = DRAGON_ALL_HEADS + (year-DRAGON_AGE_2) * YOUNG_HEAD;
            }
            else
                {
                    return head = OLD_ALL_HEADS + (year-OLD_AGE) * OLD_HEAD;
                }
        }

        return head;
    }
}
