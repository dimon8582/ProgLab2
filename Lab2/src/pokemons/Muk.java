package pokemons;

import moves.Confide;
import moves.Minimize;
import moves.MudSlap;
import moves.VenomDrench;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Muk extends Pokemon {
    public Muk(String name, int lvl) {
        super(name, lvl);

        this.setStats(105,105,75,65,100,50);
        this.setType(Type.POISON);
        this.setMove(new Confide(), new MudSlap(), new Minimize(), new VenomDrench());
    }
}
