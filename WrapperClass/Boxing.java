/*
 * processs of converting primitive Val. to into their respective non primitive valuess
 We have threse following ways :
 1.Creating Object using literal way
 2.using valueOf
 3.using new Keyword
 */

//Literal way:

/* Boxing */
class Boxing {

    public static void main(String[] args) {
        byte byt = 1;
        Byte B = byt;
        System.out.println(byt);
        System.out.println(B);
        System.out.println();

        short s = 1;
        Short S =s;
        System.out.println(s);
        System.out.println(S);
        System.out.println();

        int i = 100;
        Integer n = i;
        System.out.println(n);
        System.out.println(n.valueOf(90));
        System.out.println();
        
        long l = 152645;
        Long L = l;
        System.out.println(l);
        System.out.println(L);
        System.out.println();
    
    
        float f = 10.2f;
        Float F = f;
        System.out.println(F);
        System.out.println(F.valueOf(50.2f));
        System.out.println();
        
        double d = 203.3;
        Double D = d;
        System.out.println(d);
        System.out.println(D);
        System.out.println();

        
        char ch = 'a';
        Character CH = ch;
        System.out.println(ch);
        System.out.println(CH);
        System.out.println();

        boolean bool = true;
        Boolean Bool = bool;
        System.out.println(bool);
        System.out.println(Bool);
        System.out.println();


    }
}
