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
        return name + '\n' + "Ум: " + cunning + '\n' + "Мудрость: " + resolve + '\n' + "Остроумие: " + ambition + '\n' + "Творчество: " + adroitness + '\n' + "Жажда власти:" + lustForPower + '\n' + "Колдунство: " + Hogwarts.spell + '\n' + "Трансгрессия: " + Hogwarts.tgres;
    }
}
