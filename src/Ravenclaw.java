public class Ravenclaw extends Hogwarts {
    private final String name;
    private int mind;
    private int wisdom;
    private int creation;

    public Ravenclaw(String name, int mind, int wisdom, int creation, int spell, int tgres) {
        super(spell, tgres);
        this.name = name;
        this.mind = mind;
        this.wisdom = wisdom;
        this.creation = creation;
    }

    @Override
    public String getFullData() {
        return null;
    }
}
