public class MinElement
{
    public static void isMinElement(int[][] mass){

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

        int min = massive[0][0];

        for(int i=0; i<arrayCountN-1; i++){
            for(int j=0; j<arrayCountM; j++){
                if(massive[i][j] <= min){
                    min = massive[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Max element of massive: " + min);
        System.out.println();
    }
}

