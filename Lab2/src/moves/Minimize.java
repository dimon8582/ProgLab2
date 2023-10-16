package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Minimize extends StatusMove {
    public Minimize() {
        super(Type.NORMAL, 0, 1);
    }
    @Override
    public String describe() {
        return "Усиливает уклончивость";
    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 2);
    }
}
