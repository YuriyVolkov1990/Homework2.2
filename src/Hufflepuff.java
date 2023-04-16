public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int diligence, int loyalty, int honesty, int spell, int tgres) {
        super(spell, tgres);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String getFulldata() {
        return null;
    }
}
