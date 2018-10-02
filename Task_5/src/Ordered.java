public class Ordered {
    public static boolean isOrdered(double[] array) {

        boolean isOrdered = false;

        if (array.length < 2) {
            return true;
        }

        //order by min element
        for (int i = 0; i < (array.length - 1); i++) {
            if (!(array[i] <= array[i + 1])) {
                break;
            }
            if (i == (array.length - 2)) {
                isOrdered = true;
            }
        }

        //order by max element
        for (int i = 0; i < (array.length - 1); i++) {
            if (!(array[i] >= array[i + 1])) {
                break;
            }
            if (i == (array.length - 2)) {
                isOrdered = true;
            }
        }

        return isOrdered;
    }
}
