package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        final Creature goblin = new Creature("Goblin", 2, 2);
        System.out.println(goblin);

        final CreatureModifier root = new CreatureModifier(goblin);

        root.add(new NoBonusesModifier(goblin));
        System.out.println("Let's double Goblin attack");
        root.add(new DoubleAttackModifier(goblin));
        System.out.println("Let's increase goblin's defense");
        root.add(new IncreaseDefenseModifier(goblin));
        root.handle();
        System.out.println(goblin);


    }
}
