package pokemons;

import moves.Confide;
import moves.Minimize;
import moves.MudSlap;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grimer extends Pokemon {
    public Grimer(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.POISON);
        this.setStats(80,80,50,40,50,25);
        this.setMove(new Confide(), new MudSlap(), new Minimize());
    }
}
