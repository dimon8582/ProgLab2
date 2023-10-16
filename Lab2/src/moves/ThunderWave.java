package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 0.9);
    }
    @Override
    public String describe() {
        return "Запускает слабый электрический разряд, парализующий противника";
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.PARALYZE);
        p.addEffect(e);
    }
}
