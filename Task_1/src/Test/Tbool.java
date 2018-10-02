package Test;

public class Tbool {

        private boolean a = true;
        private boolean b = false;

        public Tbool() {
        }

        public void test()
        {
            System.out.println("___________________________________________________");
            System.out.print("A:");
            System.out.println("a = " + this.a);

            System.out.println("___________________________________________________");
            System.out.print("B:");
            System.out.println("b = " + this.b);

            System.out.println("___________________________________________________");
            System.out.print("OR:");
            System.out.println("a | b = " + (this.a | this.b));

            System.out.println("___________________________________________________");
            System.out.print("A||B:");
            System.out.println("a || b = " + (this.a || this.b));


            System.out.println("___________________________________________________");
            System.out.print("A^B:");
            System.out.println("a ^ b = " + (this.a ^ this.b));

            System.out.println("___________________________________________________");
            System.out.print("A^A:");
            System.out.println("a ^ a = " + (this.a ^ this.a));

            System.out.println("___________________________________________________");
            System.out.print("AND:");
            System.out.println("a & b = " + (this.a & this.b));

            System.out.println("___________________________________________________");
            System.out.print("&&:");
            System.out.println("a && b = " + (this.a && this.b));

            System.out.println("___________________________________________________");
            System.out.print("A=B:");
            System.out.println("a = b = " + (this.a = this.b));

            System.out.println("___________________________________________________");
            System.out.print("!B:");
            System.out.println("!b = " + !this.b);
        }
    }
