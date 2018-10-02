
public class The_second
{
    //1
    public static int isMaxValue(int numb) {
        int maxiValue = 0;
        int value;

        while (numb != 0)
        {
            value = numb % 10;
            numb /= 10;
            if (value > maxiValue)
            {
                maxiValue = value;
            }
        }
        return maxiValue;
    }


    //2
    public static boolean isPolindrome(int numb) {
        int temp = numb;
        int reverseNumb = 0;
        while (temp > 0)
        {
            int lastValue = temp % 10;
            reverseNumb = reverseNumb * 10 + lastValue;
            temp /= 10;
        }
        return numb == reverseNumb;
    }


    //3
    public static boolean isSimple(int numb) {

        if (numb == 1) {
            return false;
        }
        for (int i = 2; i * i <= numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }


    //4
    public  void isSimpleDivider(int numb) {
        System.out.print(numb + ": ");
        if (numb != 0) {
            if (numb % 2 == 0) {
                System.out.print(2);
            }
            for (int i = 3; i <= numb; i += 2) {
                if (Simple(i))
                {
                    if (numb % i == 0) {
                        System.out.print(", " + i);
                    }
                }
            }
        }
    }


    //5.1
    public static  int nod(int A, int B) {
         {
            while (A != 0 && B != 0) if (A > B)
                A = A % B;
            else B = B % A;
            return A + B;
        }

    }


    //5.2
    public  static int nok(int A, int B) {
        int nok = 0;
        int nod = nod(A, B);
        if (nod != 0)
        {
            return nok = (A * B) / nod;
        }
        return nok;
    }



    //6
    public static int isDifrentElem(int number)
    {
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            int newNumber = number;
            while (newNumber != 0)
            {
                int buffer = newNumber % 10;
                newNumber /= 10;
                if (i == buffer) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

}
