package hr.hrsak;

public class IncreaseDefenseModifier extends CreatureModifier{

    private int  token;
    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name) && (q.argument == Query.Argument.DEFENSE))
            {
                q.result*=2;
            }
        });
    }


}
