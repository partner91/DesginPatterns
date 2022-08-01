package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        final User user = new User("John Smith");
        final User2 user2 = new User2("Jane Smith");
        final User2 user3 = new User2("John Smith");

        final BetterFormattedText bft = new BetterFormattedText("Make America great again");

        System.out.println(user2);
        System.out.println(user3);

        final FormattedText ft = new FormattedText("This is brave new world");
        ft.capitalize(14,18);
        System.out.println(ft);

        bft.getRange(13,18).capitalize = true;
        System.out.println(bft);

    }
}
