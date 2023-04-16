public class Gryffindor extends Hogwarts {
    private final String name;
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int spell, int tgres) {
        super(spell, tgres);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String getFulldata() {
        return name + '\n' + "Благородство: " + nobility + '\n' + "Честь: " + + honor + '\n' + "Храбрость: " + bravery + '\n' + "Колдунство: " + Hogwarts.spell + '\n' + "Трансгрессия: " + Hogwarts.tgres;
    }

//    public String getFulldata() {
//        return name + '\n' + "Благородство: " + nobility + '\n' + "Честь: " + + honor + '\n' + "Храбрость: " + bravery + '\n' + "Колдунство: " + Hogwarts.spell + '\n' + "Трансгрессия: " + Hogwarts.tgres;
//    }


}
