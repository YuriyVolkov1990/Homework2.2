public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hogwarts!");
        Gryffindor garryPotter = new Gryffindor("Гарри Поттер", 90, 100,100,90,90);
        System.out.println("Студент: " + garryPotter.getFullData());
        Gryffindor germionaGranger = new Gryffindor("Гермиона Грейнджер",80,80,100,100,80);
        System.out.println("Студент: " + germionaGranger.getFullData());
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 70, 100, 90,80,80);
        System.out.println("Студент: " + ronWeasley.getFullData());
        Hufflepuff zahariaSmith = new Hufflepuff("Захария Смит", 100,90,80, 100, 70);
        System.out.println("Студент: " + zahariaSmith.getFullData());
        Hufflepuff sedrikDiggory = new Hufflepuff("Седрик Диггори", 90, 80, 70, 80, 80);
        System.out.println("Студент: " + sedrikDiggory.getFullData());
        Hufflepuff justinFinch = new Hufflepuff("Джастин Финч-Флетчли", 80, 80, 80, 90, 70);
        System.out.println("Студент: " + justinFinch.getFullData());
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 95, 95, 95, 95, 100, 90, 90);
        System.out.println("Студент: " + dracoMalfoy.getFullData());
        Slytherin grahamMontegy = new Slytherin("Грэхэм Монтегю", 80, 80, 80, 80, 100, 80, 80);
        System.out.println("Студент: " + grahamMontegy.getFullData());
        Slytherin gregoryGoil = new Slytherin("Грегори Гойл", 70, 70, 70, 70, 80, 80, 80);
        System.out.println("Студент: " + gregoryGoil.getFullData());
    }
}