import Test.TByte;
import Test.TChar;
import Test.TInt;
import Test.Tbool;

public class TMain {

    public TMain() {
    }

    public static void main(String[] args) {
        Tbool testBoolean = new Tbool();
        TByte testByte = new TByte();
        TInt testInt = new TInt();
        TChar testChar = new TChar();
        //testBoolean.test();
        //testByte.test();
        //testInt.test();
        testChar.test();
    }
}
