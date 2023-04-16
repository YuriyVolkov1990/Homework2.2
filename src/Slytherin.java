public class Slytherin extends Hogwarts {
    private final String name;
    private final int cunning;
    private final int resolve;
    private final int ambition;
    private final int adroitness;
    private final int lustForPower;

    public Slytherin(String name, int cunning, int resolve, int ambition, int adroitnes, int lustForPower, int spell, int tgres) {
        super(spell, tgres);
        this.name = name;
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.adroitness =adroitnes;
        this.lustForPower = lustForPower;
    }

    @Override
    public String getFullData() {
        return name + '\n' + "Хитрость: " + cunning + '\n' + "Решительность: " + resolve + '\n' + "Амбициозность: " + ambition + '\n' + "Находчивость: " + adroitness + '\n' + "Жажда власти:" + lustForPower + '\n' + "Колдунство: " + Hogwarts.spell + '\n' + "Трансгрессия: " + Hogwarts.tgres;
    }
    public int getSumPropertys() {
        return cunning + resolve + ambition + adroitness + lustForPower;
    }

    public static void getCompareSlytherin(Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.getSumPropertys() > studentTwo.getSumPropertys()) {
            System.out.println(studentOne.name + " лучший Слизеринец, чем " + studentTwo.name);
        } else {
            System.out.println(studentTwo.name + " лучший Слизеринец, чем " + studentOne.name);
        }
    }
}
