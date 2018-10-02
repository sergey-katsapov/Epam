import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Symbol {

    public final int A = 97;
    public final int E = 101;
    public final int I = 105;
    public final int O = 111;
    public final int U = 117;
    public final int Y = 121;
    public final int A_0x16 = (int) 0x61;
    public final int E_0x16 = (int) 0x65;
    public final int I_0x16 = (int) 0x69;
    public final int O_0x16 = (int) 0x6f;
    public final int U_0x16 = (int) 0x75;
    public final int Y_0x16 = (int) 0x79;
    public boolean vowel = false;



    public boolean TheFirstMethod( char vowel_symbol) {
        int[] vowel_symbols = {A, E, I, O, U, Y};
        for (int i : vowel_symbols) {
            if (i == vowel_symbol) {
                return true;
            }
        }
        return false;
    }



    public boolean TheSecondMethod(char vowel_symbol)
    {
        switch (vowel_symbol)
        {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'y':
                return true;
        }
        return false;
    }

    public boolean TheThirdMethod(char vowel_symbol) {

        if (vowel_symbol == A_0x16 ||
                vowel_symbol == E_0x16 ||
                vowel_symbol == I_0x16 ||
                vowel_symbol == O_0x16 ||
                vowel_symbol == U_0x16 ||
                vowel_symbol == Y_0x16)
        {
            return true;
        }
        return false;
    }






    public boolean TheForthMethod(char vowel_symbol)
    {
        Pattern vowelPattern = Pattern.compile("[aeiou]");
        Matcher vowelMatcher = vowelPattern.matcher("" + vowel_symbol);
        return vowelMatcher.find();
    }


}

