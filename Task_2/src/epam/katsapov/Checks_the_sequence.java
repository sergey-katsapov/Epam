package epam.katsapov;

public class Checks_the_sequence
{

        //возвращает true(false), если возрастает(убывает)
        public static boolean increaseSequence(int с)
        {
            boolean increase = true;
            int digitalNumberPreviously = 10;
            while (с > 0)
            {
                int digitalNumberCurrent = с % 10;
                if (digitalNumberPreviously != 10 && digitalNumberPreviously < digitalNumberCurrent)
                {
                    increase = false;
                }
                digitalNumberPreviously = digitalNumberCurrent;
                с = с / 10;
            }
            return increase;
        }
    }

