package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        Game game = new Game();
        final Creature goblin = new Creature(game, "Strong goblin", 2, 2);
        System.out.println(goblin);
        final IncreaseDefenseModifier increaseDefenseModifier = new IncreaseDefenseModifier(game, goblin);
        try (final DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin)){
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}
