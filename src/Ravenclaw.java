public class Ravenclaw extends Hogwarts {
    private final String name;
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, int mind, int wisdom, int wit, int creation, int spell, int tgres) {
        super(spell, tgres);
        this.name = name;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String getFullData() {
        return  name + '\n' + "Ум: " + mind + '\n' + "Мудрость: " + wisdom + '\n' + "Остроумие: " + wit + '\n' + "Творчество: " + creation + '\n' + "Колдунство: " + Hogwarts.spell + '\n' + "Трансгрессия: " + Hogwarts.tgres;
    }
    public int getSumPropertys() {
        return mind + wisdom + wit + creation;
    }

    public static void getCompareRavenclaw(Ravenclaw studentOne, Ravenclaw studentTwo) {
        if (studentOne.getSumPropertys() > studentTwo.getSumPropertys()) {
            System.out.println(studentOne.name + " лучший Когтевранец, чем " + studentTwo.name);
        } else {
            System.out.println(studentTwo.name + " лучший Когтевранец, чем " + studentOne.name);
        }
    }
}
