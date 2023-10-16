package pokemons;

import moves.Psychic;
import moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togepi extends Pokemon {
    public Togepi(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.FAIRY);
        this.setStats(35,20,65,40,65,20);
        this.setMove(new Psychic(), new ThunderWave());
    }
}
