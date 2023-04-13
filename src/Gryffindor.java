public class Gryffindor extends Hogwarts {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int spell, int tgres) {
        super(spell, tgres);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String getFulldata() {
        return name.toString() + '\n' + "Благородство: " + nobility + '\n' + "Честь: " + + honor + '\n' + "Храбрость: " + bravery + '\n' + "Колдунство:" + Hogwarts.spell + '\n' + "Трансгрессия:" + Hogwarts.tgres;
    }


}
