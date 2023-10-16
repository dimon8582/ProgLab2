
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon Hawlucha = new Hawlucha("Hawlucha", 1);
        Pokemon Togetic = new Togetic("Togetic", 1);
        Pokemon Grimer = new Grimer("Grimer", 1);
        Pokemon Muk = new Muk("Muk", 1);
        Pokemon Togepi = new Togepi("Togepi", 1);
        Pokemon Togekiss = new Togekiss("Togekiss", 1);
        b.addAlly(Hawlucha);
        b.addAlly(Togetic);
        b.addFoe(Grimer);
        b.addFoe(Muk);
        b.addAlly(Togepi);
        b.addFoe(Togekiss);
        b.go();
    }
}


