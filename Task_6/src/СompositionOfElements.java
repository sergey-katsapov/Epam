public class СompositionOfElements {

    public static void isСompositionOfElements(int[][] mass) {
        int product;

        int min_product = 1000;
        int min_index = -1;

        int arrayCountN = 3;
        int arrayCountM = 3;
        int[][] massive = new int[arrayCountN][arrayCountM]; //N*M


        //array filling
        for (int i = 0; i < arrayCountN; i++) {
            for (int j = 0; j < arrayCountM; j++) {
                massive[i][j] = ((int) Math.round(Math.random() * 10));
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }



        //СompositionOfElements
        for (int i = 0; i < arrayCountN; i++) {
            product = 1;
            for (int j = 0; j < arrayCountM; j++) {
                product *= massive[i][j];
            }
            if (product < min_product)
            {
                min_product = product;
                min_index = i;
            }
        }
        System.out.println("Min product:" + min_product);
        System.out.println("Min index:" + min_index);


    }
}

