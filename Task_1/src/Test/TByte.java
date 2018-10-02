package Test;

public class TByte {
        byte a = 120;
        byte b = 60;
        byte c = 0;

    public TByte() {
    }

    public void test()
    {

        byte sum = (byte) (a + b);
        System.out.println("___________________________________________________");
        System.out.print("Summ:");
        System.out.printf("%d + %d = %d",  a, b, sum);
        System.out.println(" ");


        byte sub = (byte) (a - b);
        System.out.println("___________________________________________________");
        System.out.print("Sub:");
        System.out.printf("%d - %d = %d",  a, b, sub);
        System.out.println(" ");

        byte div = (byte) (b / a);
        System.out.println("___________________________________________________");
        System.out.print("Division:");
        System.out.printf("\n%d / %d = %d",  b, a, div);
        System.out.println(" ");

        byte mul = (byte) (b * a);
        System.out.println("___________________________________________________");
        System.out.print("multiplication:");
        System.out.printf("\n%d * %d = %d",  b, a, mul);
        System.out.println(" ");


        c += b;
        System.out.println("___________________________________________________");
        System.out.print("Combinated summary:");
        System.out.printf("\n c += и -- %d",   c);
        System.out.println(" ");


        c -= b;
        System.out.println("___________________________________________________");
        System.out.print("Combinated subtraction:");
        System.out.printf("\n c -= и -- %d",   c);
        System.out.println(" ");

        c *= b;
        System.out.println("___________________________________________________");
        System.out.print("Combinated multiplication:");
        System.out.printf("\n c *= и -- %d",   c);
        System.out.println(" ");


        byte cpred = --c;
        System.out.println("___________________________________________________");
        System.out.print("predecrement:");
        System.out.printf("\n--c = %d",   cpred);
        System.out.println(" ");


        byte cpostd = c--;
        System.out.println("___________________________________________________");
        System.out.print("postdecrement:");
        System.out.printf("\nc-- = %d",   cpostd);
        System.out.println(" ");





        byte z = (byte) (a^b);
        System.out.println("___________________________________________________");
        System.out.print("XOR(^):");
        System.out.printf("\n%d ^ %d = %d", a, b, z);
        System.out.print("Binarry XOR:");
        System.out.printf("\nIn Binary form: %s ^ %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(z));
        System.out.println(" ");

        byte x = (byte) (a|b);
        System.out.println("___________________________________________________");
        System.out.print("OR(|):");
        System.out.printf("\n%d | %d = %d", a, b, x);
        System.out.println(" ");


        byte y = (byte) (a&b);
        System.out.println("___________________________________________________");
        System.out.print("AND(&):");
        System.out.printf("\n%d & %d = %d", a, b, y);
        System.out.println(" ");


        a = (byte) ~b;
        System.out.println("___________________________________________________");
        System.out.print("NOT(~):");
        System.out.printf("%d = ~%d", b, a);
        System.out.println(" ");


        c = (byte) (a>>2);
        System.out.println("___________________________________________________");
        System.out.print("Right shift");
        System.out.printf("\n%d >> 2 = %d", a, c);
        System.out.println(" ");



        c = (byte) (a<<2);
        System.out.println("___________________________________________________");
        System.out.print("Left shift");
        System.out.printf("\n%d<< 2 = %d", a, c);
        System.out.println(" ");



        c = (byte) (a>>>3);
        System.out.println("___________________________________________________");
        System.out.print(">>>");
        System.out.printf("\n%d >>> 3 = %d", a, c);
        System.out.println(" ");

        }
}