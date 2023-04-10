public class Slytherin extends Hogwarts {
    private int cunning;
    private int resolve;
    private int ambition;
    private int adroitness;
    private int lustForPower;

    public Slytherin(int cunning, int resolve, int ambition, int adroitnes, int lustForPower, int spell, int tgres) {
        super(spell, tgres);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.adroitness =adroitnes;
        this.lustForPower = lustForPower;
    }
}
