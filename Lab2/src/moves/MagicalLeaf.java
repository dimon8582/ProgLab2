package moves;

import ru.ifmo.se.pokemon.*;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf() {
        super(Type.GRASS, 60, 1);
    }
    @Override
    public String describe() {
        return "Атакует странным листом, от которого невозможно уклониться";
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}
