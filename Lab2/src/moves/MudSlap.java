package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MudSlap extends SpecialMove {
    public MudSlap() {
        super(Type.GROUND, 20, 1);
    }
    @Override
    public String describe() {
        return "Швыряет грязь в лицо противнику, снижая его точность";
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }
}
