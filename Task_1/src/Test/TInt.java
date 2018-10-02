package Test;

public class TInt {
    private int a = 100;
    private int b = 20;
    private int result = 0;

    public TInt() {
    }

    public void test() {

        this.result = this.a + this.b;
        System.out.println("___________________________________________________");
        System.out.print("Sum:");
        System.out.printf("%d + %d = %d\n", this.a, this.b, this.result);


        this.result = this.a * this.b;
        System.out.println("___________________________________________________");
        System.out.print("Mult:");
        System.out.printf("%d * %d = %d\n", this.a, this.b, this.result);


        this.result = this.b / this.a;
        System.out.println("___________________________________________________");
        System.out.print("Div:");
        System.out.printf("%d / %d = %d\n", this.b, this.a, this.result);


        this.result = this.a ^ this.b;
        System.out.println("___________________________________________________");
        System.out.print("XOR:");
        System.out.printf("%d ^ %d = %d\n", this.a, this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));


        this.result = this.a | this.b;
        System.out.println("___________________________________________________");
        System.out.print("OR:");
        System.out.printf("%d | %d = %d\n", this.a, this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));


        this.result = this.a & this.b;
        System.out.println("___________________________________________________");
        System.out.print("AND:");
        System.out.printf("%d & %d = %d\n", this.a, this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));


        this.result = ~this.b;
        System.out.println("___________________________________________________");
        System.out.print("NOT:");
        System.out.printf("%d = ~%d\n", this.b, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s = ~%s\n", Integer.toBinaryString(this.b), Integer.toBinaryString(this.result));


        this.result = this.a >> 2;
        System.out.println("___________________________________________________");
        System.out.print("Right shift:");
        System.out.printf("%d >> 2 = %d\n", this.a, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.result));


        this.result = this.a << 2;
        System.out.println("___________________________________________________");
        System.out.print("Left shift:");
        System.out.printf("%d<< 2 = %d\n", this.a, this.result);
        System.out.print("Binary: ");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.result));


        this.result = this.a >>> 3;
        System.out.println("___________________________________________________");
        System.out.print(">>>:");
        System.out.printf("%d >>> 3 = %d\n", this.a, this.result);
        System.out.print("Binary:  ");
        System.out.printf(" %s >> 3 = %s\n", Integer.toBinaryString(this.a), Integer.toBinaryString(this.result));
    }
}