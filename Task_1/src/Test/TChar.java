package Test;

public class TChar {
    private char a = '4';
    private char b = '3';
    private char result = '0';

    public TChar() {
    }

    public void test()
    {
        this.result = (char)(this.a + this.b);
        System.out.println("___________________________________________________");
        System.out.print("Summ:");
        System.out.printf("%c + %c = %c\n", this.a, this.b, this.result);
        System.out.println(" ");

        this.result = (char)(this.a - this.b);
        System.out.println("___________________________________________________");
        System.out.print("Sub:");
        System.out.printf("%c - %c = %c\n", this.a, this.b, this.result);
        System.out.println(" ");


        this.result = (char)(this.a * this.b);
        System.out.println("___________________________________________________");
        System.out.print("Mult:");
        System.out.printf("%c * %c = %c\n", this.a, this.b, this.result);
        System.out.println(" ");



        this.result = (char)(this.b / this.a);
        System.out.println("___________________________________________________");
        System.out.print("Div:");
        System.out.printf("%c / %c = %c\n", this.b, this.a, this.result);
        System.out.println(" ");


        this.result = (char)(this.a ^ this.b);
        System.out.println("___________________________________________________");
        System.out.print("XOR:");
        System.out.printf("%c ^ %c = %c\n", this.a, this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));
        System.out.println(" ");


        this.result = (char)(this.a | this.b);
        System.out.println("___________________________________________________");
        System.out.print("OR:");
        System.out.printf("%c | %c = %c\n", this.a, this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));
        System.out.println(" ");


        this.result = (char)(this.a & this.b);
        System.out.println("___________________________________________________");
        System.out.print("AND:");
        System.out.printf("%c & %c = %c\n", this.a, this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));
        System.out.println(" ");


        this.result = (char)(~this.b);
        System.out.println("___________________________________________________");
        System.out.print("NOT:");
        System.out.printf("%c = ~%c\n", this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s = ~%s\n", Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));
        System.out.println(" ");


        this.result = (char)(this.a >> 2);
        System.out.println("___________________________________________________");
        System.out.print("Right shift:");
        System.out.printf("%c >> 2 = %c\n", this.a, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.result));
        System.out.println(" ");


        this.result = (char)(this.a << 2);
        System.out.println("___________________________________________________");
        System.out.print("Left shift:");
        System.out.printf("%c<< 2 = %c\n", this.a, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.result));
        System.out.println(" ");


        this.result = (char)(this.a >>> 3);
        System.out.println("___________________________________________________");
        System.out.print(">>>:");
        System.out.printf("%c >>> 3 = %c\n", this.a, this.result);
        System.out.print("Binary: ");
        System.out.printf(" %s >> 3 = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.result));
        System.out.println(" ");
    }
}
