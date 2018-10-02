public class Test
{
    public static void main(String[] args)
    {

        int n  = 100;
        int m  = 100;

        int[][] a=new int[n][m];

/*

        System.out.print("Max element:");
        System.out.println(MaxElement.isMaxElement(massive));
*/

        System.out.println("___________________________MAX____________________________________");
        MaxElement.isMaxElement(a);
        System.out.println("___________________________MIN____________________________________");
        MinElement.isMinElement(a);
        System.out.println("___________________________Arithmetical_Mean____________________________________");
        ArithmeticalMean.isArithmeticalMean(a);
        //System.out.println("___________________________Geometrical_Mean____________________________________");
        //GeometricalMean.isGeometricallMean(a);
        System.out.println("___________________________Transpor____________________________________");
        Transpose.isTranspose(a);
        System.out.println("___________________________Composition____________________________________");
        СompositionOfElements.isСompositionOfElements(a);




    }
}
