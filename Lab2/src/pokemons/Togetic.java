package pokemons;

import moves.MagicalLeaf;
import moves.Psychic;
import moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Pokemon {
    public Togetic(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.FAIRY, Type.FLYING);
        this.setStats(55,40,85,80,105,40);
        this.setMove(new Psychic(), new ThunderWave(), new MagicalLeaf());
    }
}
