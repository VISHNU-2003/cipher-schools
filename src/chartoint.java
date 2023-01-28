public class chartoint {

    public static void main(String[] args) {
        int x= 5;
        int y=7;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        byte b = 10;
        System.out.println("b is: " + b);

        byte b2 = (byte)129;
        System.out.println("B2 is: " + b2);

        int i=b;
        System.out.println("i is: " + i);

        float f = (float)5.3;

        float f2 = 5.5f;

        double d = 18.5;

        char ch = 'a';
        System.out.println(ch);

        int a = Character.getNumericValue('a');
        System.out.println("A is: " + a);

        char c = 'a';
        int ax = c;
        System.out.println(ax);

        System.out.println((int)('a'));
        System.out.println((int)('A'));

        char c3 = 'b';
        int e = c3 + 'a';
        System.out.println("E is: " + e);

        int z = x+y;

        int p = 5;
        int q = ++p;
        System.out.println("P is: " + p +" Q, is: " + q);

        Integer x1 = new Integer(x);
        System.out.println(x1);
    }

}
