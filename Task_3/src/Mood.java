import java.util.Random;

public class Mood
{
    public static final String SMILE = " :-) ";
    public static final String MELANCHOLY = " :-( ";
    public static final String SADNESS = " :-S ";
    public static final String DELIGHT = " :-D ";

    public static String chooseMood()
    {
        Random random = new Random();
        String result;
        int Number = random.nextInt(4);
        switch (Number) {
            case 0:
                result = SMILE;
                break;
            case 1:
                result = MELANCHOLY;
                break;
            case 2:
                result = SADNESS;
                break;
            case 3:
                result = DELIGHT;
                break;
            default:
                result = "error";
                break;
        }
        return result;
    }
}
