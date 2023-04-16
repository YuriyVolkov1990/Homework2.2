public abstract class Hogwarts {
    String name;
    int spell;
    int tgres;

    public Hogwarts(String name, int spell, int tgres) {
       this.name = name;
       this.spell = spell;
       this.tgres = tgres;
    }

    public abstract String getFullData();
    public static void getCompareGeneral (Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.spell > studentTwo.spell) {
            System.out.println(studentOne.name + " обладает большей мощностью колдунства, чем " + studentTwo.name);
        } else {System.out.println(studentTwo.name + " обладает большей мощностью колдунства, чем " + studentOne.name);}
    }
}