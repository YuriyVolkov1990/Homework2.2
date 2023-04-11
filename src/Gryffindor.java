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
        return this.name + ": Благородство: " + this.nobility + "; Честь: " + this.honor + "; Храбрость: " + this.bravery + "" + ;
    }


}
