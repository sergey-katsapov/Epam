public class Test
{
    public static void main(String[] args)
    {
        System.out.println("_________________________________________#1__________________________________________");
        The_first_coins the_firstCoins = new The_first_coins();
        the_firstCoins.toss(1000);
        System.out.println(the_firstCoins.toString());

        System.out.println("_________________________________________#2__________________________________________");
        System.out.println("Max value -  " + The_second.isMaxValue(2435691));
        System.out.println("Polindrome - " + The_second.isPolindrome(2662));
        System.out.println("Simple -  " + The_second.isSimple(7));
        System.out.println("NOD - " + The_second.nod(3, 9));
        System.out.println("NOK - " + The_second.nok(2, 12));
        System.out.println("Count od Different numbers - " + The_second.isDifrentElem(12344321));

        System.out.println("_________________________________________#3__________________________________________");
        System.out.println("Perfect: "+ The_third.isPerfect(9218));

    }
}

