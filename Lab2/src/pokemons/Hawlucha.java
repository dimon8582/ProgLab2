package pokemons;

import moves.RockTomb;
import moves.SteelWing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hawlucha extends Pokemon {
    public Hawlucha(String name, int lvl) {
        super(name, lvl);

        this.setStats(78,92,75,74,63,118);
        this.setType(Type.FIGHTING,Type.FLYING);
        this.setMove(new SteelWing(), new RockTomb());
    }
}
