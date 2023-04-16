public class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int diligence, int loyalty, int honesty, int spell, int tgres) {
        super(name, spell, tgres);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String getFullData() {
        return name + '\n' + "Трудолюбие: " + diligence + '\n' + "Верность: " + + loyalty + '\n' + "Честность: " + honesty + '\n' + "Колдунство: " + spell + '\n' + "Трансгрессия: " + tgres;
    }
    public int getSumPropertys() {
        return diligence + loyalty + honesty;
    }

    public static void getCompare(Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne.getSumPropertys() > studentTwo.getSumPropertys()) {
            System.out.println(studentOne.name + " лучший Пуффендуец, чем " + studentTwo.name);
        } else {
            System.out.println(studentTwo.name + " лучший Пуффендуец, чем " + studentOne.name);
        }
    }
}
