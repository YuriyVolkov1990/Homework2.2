public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int creation;

    public Ravenclaw(int mind, int wisdom, int creation, int spell, int tgres) {
        super(spell, tgres);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creation = creation;
    }
}
