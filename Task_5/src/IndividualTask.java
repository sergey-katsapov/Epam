public class IndividualTask {
    public static int countOfPositiveElement(int[] massive) {
        int counter = 0;
        int K = massive.length;
        for (int i = 0; i < K; i++) {
            if (massive[i] > 0)
                counter += 1;
        }
        return counter;
    }


    public static int sumOfElementsEqualToZero(int[] massive) {
        int sum = 0;
        int K = massive.length;
        for (int i = K-1; i >= 0; i--)
        {
            if (massive[i] == 0)
            {
                break;
            }
            sum += massive[i];
        }
    return sum;
    }
}