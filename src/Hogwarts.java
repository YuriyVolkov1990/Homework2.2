public abstract class Hogwarts {
    static int spell;
    static int tgres;

    public Hogwarts(int spell, int tgres) {
        Hogwarts.spell = spell;
        Hogwarts.tgres = tgres;
    }

    public abstract String getFullData();


}