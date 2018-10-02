public class ArithmeticalMean {

        public static void isArithmeticalMean(int[][] mass){
            int sum = 0;
            int mean = 0;
            int count = 0;
            int arrayCountN = 5;
            int arrayCountM = 4;
            int[][] massive = new int[arrayCountN][arrayCountM];

            for(int i=0;i<arrayCountN;i++)
            {
                for(int j=0;j<arrayCountM;j++)
                {
                    massive[i][j] = ((int)Math.round(Math.random()*100));
                    System.out.print(massive[i][j] + ", ");
                }
                System.out.println();
            }

            int max = massive[0][0];

            for(int i=0; i<arrayCountN-1; i++){
                for(int j=0; j<arrayCountM; j++){
                    if(massive[i][j] > 0 )
                    {
                        sum += massive[i][j];
                        count++;
                    }
                }
            }

            if (count > 0){
                 mean = sum /count;
            }
            System.out.println();
            System.out.println("Arithmetical: " +sum + "/"+count + "=" + + mean);
            System.out.println();
        }
    }


