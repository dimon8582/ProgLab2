package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ExtremeSpeed extends PhysicalMove {
    public ExtremeSpeed() {
        super(Type.NORMAL, 80, 1, 2, 1);
    }
    @Override
    public String describe() {
        return "Запускает чрезвычайно быструю и мощную атаку";
    }
}
