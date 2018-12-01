//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package JavaPrimer_chapter1;

public class WrapperDemo {
    public WrapperDemo() {
    }

    public static void main(String[] var0) {
        byte var1 = 8;
        Integer var2 = new Integer(12);
        int var3 = var2;
        int var4 = var1 + var2;
        var2 = 3 * var4;
        Integer var5 = new Integer("-135");
        int var6 = Integer.parseInt("2013");
        System.out.println("a = " + var2);
        System.out.println("b = " + var5);
        System.out.println("j = " + var1);
        System.out.println("k = " + var3);
        System.out.println("m = " + var4);
        System.out.println("n = " + var6);
    }
}
