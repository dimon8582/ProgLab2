package moves;

import ru.ifmo.se.pokemon.*;

import java.util.concurrent.locks.Condition;

public class VenomDrench extends StatusMove {
    public VenomDrench() {
        super(Type.POISON, 0, 1);
    }
    @Override
    public String describe() {
        return "Использует Venom Drench";
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.POISON) {
            Effect e = new Effect().turns(-1).stat(Stat.ATTACK, -1).stat(Stat.SPEED, -1).stat(Stat.SPECIAL_ATTACK, -1);
            p.addEffect(e);
        }
    }
}
