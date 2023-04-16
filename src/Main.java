public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hogwarts!");
        Gryffindor GarryPotter = new Gryffindor("Гарри Поттер", 90, 100,100,90,90);
        System.out.println("Студент: " + GarryPotter.getFullData());
        Gryffindor GermionaGranger = new Gryffindor("Гермиона Грейнджер",80,100,100,100,80);
        System.out.println("Студент: " + GermionaGranger.getFullData());
    }
}