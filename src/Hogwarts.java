public abstract class Hogwarts {
    protected String name;
    protected int spell;
    protected int tgres;

    public Hogwarts(String name, int spell, int tgres) {
       this.name = name;
       this.spell = spell;
       this.tgres = tgres;
    }

    public void getCompareGeneral (Hogwarts studentOne) {
        if (studentOne.spell > this.spell) {
            System.out.println(studentOne.name + " обладает большей мощностью колдунства, чем " + this.name);
        } else if (studentOne.spell < this.spell) {
            System.out.println(this.name + " обладает большей мощностью колдунства, чем " + studentOne.name);
        } else {
            System.out.println("Мощность колдуства " + studentOne.name + " и " + this.name + " одинаковая");
        }
        if (studentOne.tgres > this.tgres) {
            System.out.println(studentOne.name + " обладает большим расстоянием трансгрессии, чем " + this.name);
        } else if (studentOne.tgres < this.tgres) {
            System.out.println(this.name + " обладает большим расстоянием трансгрессии, чем " + studentOne.name);
        } else {
            System.out.println("Расстояние трансгрессии " + studentOne.name + " и " + this.name + " одинаковая");
        }
    }

}