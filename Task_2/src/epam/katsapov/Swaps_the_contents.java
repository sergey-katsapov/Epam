package epam.katsapov;

public class Swaps_the_contents {

        private int a;
        private int b;


        public Swaps_the_contents(int a, int b) {
            this.a = a;
            this.b = b;
        }

        //замена
        public void swapInt()
        {
            a = a + b;
            b = a - b;
            a = a - b;
        }


        @Override
        public String toString() {
            return "Swap - [" +
                    "" + a +
                    ", " + b +
                    ']';
        }
    }

