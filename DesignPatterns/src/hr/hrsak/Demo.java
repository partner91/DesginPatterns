package hr.hrsak;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {
    public static void main(String[] args) {

        Foo foo = new Foo(42, "life");
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.whatever = "sada";
        System.out.println(foo);
        System.out.println(foo2);

    }
}
