import java.util.Random;

public class RandomInt {
    public static void task1(int I)
    {

        Random random = new Random();
        int[] array = new int[I];


        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt();
        }

        int sum = IndividualTask.countOfPositiveElement(array);
        System.out.println("Count Of Positive Element: "+ sum);


        int sum1 = IndividualTask.sumOfElementsEqualToZero(array);
        System.out.println("Sum Of Elements Equal To Zero: "+ sum1);

    }
}