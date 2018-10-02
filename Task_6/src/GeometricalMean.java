import static java.sql.Types.NULL;

public class GeometricalMean {
    public static void isGeometricallMean(int[][] mass){
        
        int mul = 0;
        double mean = 0.0 ;
        int count = 0;
        int arrayCountN = 2;
        int arrayCountM = 2;
        int[][] massive = new int[arrayCountN][arrayCountM];

        
        for(int i=0;i<arrayCountN;i++)
        {
            for(int j=0;j<arrayCountM;j++)
            {
                massive[i][j] = ((int)Math.round(Math.random()*100));
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }

        
        for(int i=0; i<arrayCountN; i++)
        {
            for(int j=0; j<arrayCountM; j++){
                {
                    mul *= massive[i][j];
                }
            }
        }
        mean = Math.pow(mul, 1.0 / (arrayCountN*arrayCountM));

        
        System.out.println();
        System.out.println("Geometrical: "+ mean);
        System.out.println();
    }

    //check empty
    boolean isArrayEmpty(int[][] mass)
    {
        return mass.length == 0;
    }

}


