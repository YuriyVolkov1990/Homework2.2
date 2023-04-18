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
    public String toString() {
        return "факультета Hufflepuff" + '\n' +
                "name=" + name + '\n' +
                "diligence=" + diligence + '\n' +
                "loyalty=" + loyalty + '\n' +
                "honesty=" + honesty + '\n' +
                "spell=" + spell + '\n' +
                "tgres=" + tgres;
    }

    public int getSumPropertys() {
        return diligence + loyalty + honesty;
    }

    public void getCompare(Hufflepuff studentOne) {
        if (studentOne.getSumPropertys() > this.getSumPropertys()) {
            System.out.println(studentOne.name + " лучший Пуффендуец, чем " + this.name);
        } else {
            System.out.println(this.name + " лучший Пуффендуец, чем " + studentOne.name);
        }
    }

}
