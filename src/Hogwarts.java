public abstract class Hogwarts {
    protected String name;
    protected int spell;
    protected int tgres;

    public Hogwarts(String name, int spell, int tgres) {
       this.name = name;
       this.spell = spell;
       this.tgres = tgres;
    }

    public static void getCompareGeneral (Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.spell > studentTwo.spell) {
            System.out.println(studentOne.name + " обладает большей мощностью колдунства, чем " + studentTwo.name);
        } else if (studentOne.spell < studentTwo.spell) {
            System.out.println(studentTwo.name + " обладает большей мощностью колдунства, чем " + studentOne.name);
        } else {
            System.out.println("Мощность колдуства " + studentOne.name + " и " + studentTwo.name + " одинаковая");
        }
        if (studentOne.tgres > studentTwo.tgres) {
            System.out.println(studentOne.name + " обладает большим расстоянием трансгрессии, чем " + studentTwo.name);
        } else if (studentOne.tgres < studentTwo.tgres) {
            System.out.println(studentTwo.name + " обладает большим расстоянием трансгрессии, чем " + studentOne.name);
        } else {
            System.out.println("Расстояние трансгрессии " + studentOne.name + " и " + studentTwo.name + " одинаковая");
        }
    }

}