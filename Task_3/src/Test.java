import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Test {

        public static void main(String[] args)
        {


            //Mood
            System.out.println(Mood.chooseMood());

            //dragon
            Dragon dragon = new Dragon();
            System.out.println(dragon.headNumber(1000) + " heads");

            //Date
            System.out.println(Date.changeDate(12,2,2014));

        }
}
