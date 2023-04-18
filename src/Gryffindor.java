public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int spell, int tgres) {
        super(name, spell, tgres);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "факультета Gryffindor" + '\n' +
                "name=" + name + '\n' +
                "nobility=" + nobility + '\n' +
                "honor=" + honor + '\n' +
                "bravery=" + bravery + '\n' +
                "spell=" + spell + '\n' +
                "tgres=" + tgres;
    }

    public int getSumPropertys() {
        return nobility + honor + bravery;
    }

    public static void getCompare(Gryffindor studentOne, Gryffindor studentTwo) {
        if (studentOne.getSumPropertys() > studentTwo.getSumPropertys()) {
            System.out.println(studentOne.name + " лучший Гриффиндорец, чем " + studentTwo.name);
        } else {
            System.out.println(studentTwo.name + " лучший Гриффиндорец, чем " + studentOne.name);
        }
    }

}
