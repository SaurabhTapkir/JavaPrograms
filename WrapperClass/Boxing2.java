/**
 * Boxing-2
 * By using valueOf()
 */
class Boxing2 {
    public static void main(String[] args) {

        byte byt = 1;
        Byte B = Byte.valueOf(byt);
        System.out.println(B);
        System.out.println();

        short s = 20;
        Short S = Short.valueOf(s);
        System.out.println(s);
        System.out.println(S);
        System.out.println();

        int a = 10;
        Integer i = Integer.valueOf(a);
        System.out.println(a);
        System.out.println(i);
        System.out.println();

        long l = 152645;
        Long L = Long.valueOf(l);
        System.out.println(l);
        System.out.println(L);
        System.out.println();

        float b = 14.2f;
        Float f = Float.valueOf(b);
        System.out.println(b);
        System.out.println(f);
        // typecasting
        int typecasting = (int) b;
        char typecasting2 = (char) b;
        System.out.println("TypeCasting " + typecasting);
        System.out.println("TypeCasting of char " + typecasting2);
        System.out.println();

        double d = 203.3;
        Double D = Double.valueOf(d);
        System.out.println(d);
        System.out.println(D);
        System.out.println();

        char ch = 'a';
        Character CH = Character.valueOf(ch);
        System.out.println(ch);
        System.out.println(CH);
        System.out.println();

        boolean bool = true;
        Boolean Bool = Boolean.valueOf(bool);
        System.out.println(bool);
        System.out.println(Bool);
        System.out.println();

    }
}