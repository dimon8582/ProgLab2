package pokemons;

import moves.ExtremeSpeed;
import moves.MagicalLeaf;
import moves.Psychic;
import moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togekiss extends Pokemon {
    public Togekiss(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.FAIRY, Type.FLYING);
        this.setStats(85,50,95,120,115,80);
        this.setMove(new Psychic(), new ThunderWave(), new MagicalLeaf(), new ExtremeSpeed());
    }
}
