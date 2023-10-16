package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60,0.95);
    }
    @Override
    public String describe() {
        return "Не дает противнику двигаться с помощью камней и снижает СКОРОСТЬ";
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
}
