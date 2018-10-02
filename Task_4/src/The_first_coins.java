import java.util.Random;

public class The_first_coins
{

        private final int HEAD = 0;
        private final int TAIL = 1;
        private final int OTHER = 2;

        private int head = 0;
        private int tail = 0;
        int rand;

        public void toss(int count)
        {
            Random random = new Random();
            for (int i = 0; i < count; i++)
            {
                rand = random.nextInt(OTHER);

                if (rand == HEAD)
                {
                    head++;
                } else if (rand == TAIL) {
                    tail++;
                }
            }
        }




        public int getTail(){
            return tail;
        }
        public int getHead(){
            return head;
        }
    @Override
    public String toString() {
        return "Toss: " + "Heads = " + head + ", Tails = " + tail+ ".";
    }
    }
