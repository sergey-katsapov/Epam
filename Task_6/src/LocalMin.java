public class LocalMin
{
    public static int isLocalMin(int[][] mass)
    {
        int position = -1;
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



        for(int i=0; i<arrayCountN-1; i++)
        {
            for(int j=0; j<arrayCountM; j++)
            {
                if((massive[i][j] > massive[i - 1][j]) && (massive[i][j] > massive[i + 1][j]))
                {
                    if((massive[i][j] > massive[i][j - 1]) && (massive[i][j] > massive[i ][j+1]))
                    {
                        System.out.print(i + ", ");
                        return i;
                    }
                }
            }
        }
    return position;
    }
}

