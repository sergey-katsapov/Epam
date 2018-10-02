public class Transpose {

    public static void isTranspose(int[][] mass) {

             int arrayCountN = 5;
             int arrayCountM = 4;
            // часть 1 - создаем матрицу n на n

            int[][] massive = new int[arrayCountN][arrayCountM];
            for (int i = 0; i < arrayCountN; i++) {
                for (int j = 0; j < arrayCountM; j++) {
                    massive[i][j] = ((int)Math.round(Math.random()*100));
                }
            }

            // часть 2 - выводит на экран начальную матрицу
            System.out.println("Начальная матрица");
            System.out.println("------");

            for (int i = 0; i < arrayCountN; i++) {
                for (int j = 0; j < arrayCountM; j++) {
                    System.out.printf("%4d", massive[i][j]);
                }
                System.out.println();
            }

            // часть 3 - транспонирование матрицы
            for (int i = 0; i < arrayCountN; i++) {
                for (int j = i+1; j < arrayCountM; j++) {
                    int temp = massive[i][j];
                    massive[i][j] = massive[j][i];
                    massive[j][i] = temp;
                }
            }

            // часть 4 - выводит на экран транспонированную матрицу
            System.out.println();
            System.out.println("Новая матрица");
            System.out.println("------");
            for (int i = 0; i < arrayCountN; i++) {
                for (int j = 0; j <  arrayCountM; j++) {
                    System.out.printf("%3d", massive[i][j]);
                }
                System.out.println();
            }

        }
    }
