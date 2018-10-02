public class MaxElement
{
    public static void isMaxElement(int[][] mass)
    {

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
                if(massive[i][j]>max){
                    max = massive[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Max element of massive: " + max);
        System.out.println();
    }
}

