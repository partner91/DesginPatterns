package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        final MagicString s = new MagicString("Hello");
        System.out.println(s + " has " + s.getNumberOfVowels() + " number of vowels");
    }
}
