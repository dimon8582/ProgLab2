package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SteelWing extends PhysicalMove {
    public SteelWing() {
        super(Type.STEEL, 70, 0.9);
    }
    @Override
    public String describe() {
        return "Использует Steel Wing";
    }
    @Override
    public void applySelfEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.DEFENSE, 1);
        }
    }
}
