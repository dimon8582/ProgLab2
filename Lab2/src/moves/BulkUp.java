package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BulkUp extends StatusMove {
    public BulkUp() {
        super(Type.FIGHTING, 0, 1);
    }
    @Override
    public String describe() {
        return "Укрепляет тело, повышая как АТАКУ, так и ЗАЩИТУ";
    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
        p.setMod(Stat.ATTACK, 1);
    }
}
