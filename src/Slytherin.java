public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int resolve;
    private final int ambition;
    private final int adroitness;
    private final int lustForPower;

    public Slytherin(String name, int cunning, int resolve, int ambition, int adroitnes, int lustForPower, int spell, int tgres) {
        super(name, spell, tgres);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.adroitness =adroitnes;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "факультета Slytherin" + '\n' +
                "name=" + name + '\n' +
                "cunning=" + cunning + '\n' +
                "resolve=" + resolve + '\n' +
                "ambition=" + ambition + '\n' +
                "adroitness=" + adroitness + '\n' +
                "lustForPower=" + lustForPower + '\n' +
                "spell=" + spell + '\n' +
                "tgres=" + tgres;
    }

    public int getSumPropertys() {
        return cunning + resolve + ambition + adroitness + lustForPower;
    }

    public void getCompare(Slytherin studentOne) {
        if (studentOne.getSumPropertys() > this.getSumPropertys()) {
            System.out.println(studentOne.name + " лучший Слизеринец, чем " + this.name);
        } else {
            System.out.println(this.name + " лучший Слизеринец, чем " + studentOne.name);
        }
    }

}
