// using value() of wrapper class
class Unboxing2 {
    public static void main(String[] args) {
        
        Byte byt =1;
        byte byt2=byt.byteValue();
        System.out.println(byt2);
        
        Integer i = 120;
        int a = i.intValue();// NonPrimitve
        System.out.println(a);

        Long l1 = 125644l;
        long l2 = l1.longValue();
        System.out.println(l2);

        Float f = 15.3f;
        float f2 = f.floatValue();
        System.out.println(f2);

        Character ch = 'a';
        char ch2 = ch.charValue();
        System.out.println(ch2);

        Boolean b = true;
        boolean b2 = b.booleanValue();
        System.out.println(ch2);

    }

}
