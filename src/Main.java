public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hogwarts!");
        Hogwarts garryPotter = new Gryffindor("Гарри Поттер", 0, 0,0,100,100);
        Hogwarts germionaGranger = new Gryffindor("Гермиона Грейнджер",80,80,100,100,80);
        Hogwarts ronWeasley = new Gryffindor("Рон Уизли", 70, 100, 90,80,80);
        Hogwarts zahariaSmith = new Hufflepuff("Захария Смит", 100,90,80, 100, 70);
        Hogwarts sedrikDiggory = new Hufflepuff("Седрик Диггори", 90, 80, 70, 80, 80);
        Hogwarts justinFinch = new Hufflepuff("Джастин Финч-Флетчли", 80, 80, 80, 90, 70);
        Hogwarts chzhowChang = new Ravenclaw("Чжоу Чанг", 90,70,70,90,100,90);
        Hogwarts padmaPatil = new Ravenclaw("Падма Патил", 90,80,80,90,80,90);
        Hogwarts marcusBelby = new Ravenclaw("Маркус Белби", 100,70,80,90,90,100);
        Hogwarts dracoMalfoy = new Slytherin("Драко Малфой", 95, 95, 95, 95, 100, 100, 90);
        Hogwarts grahamMontegy = new Slytherin("Грэхэм Монтегю", 100, 100, 100, 100, 100, 80, 80);
        Hogwarts gregoryGoil = new Slytherin("Грегори Гойл", 70, 70, 70, 70, 80, 80, 80);
        Hogwarts[] students = {garryPotter, germionaGranger, ronWeasley, zahariaSmith, sedrikDiggory, justinFinch, chzhowChang,  padmaPatil, marcusBelby, dracoMalfoy, grahamMontegy, gregoryGoil};
        for (Hogwarts student:
             students) {
            System.out.println("Студент " + student.toString());
        }
        ((Gryffindor) garryPotter).getCompare((Gryffindor) germionaGranger);
        ((Hufflepuff) zahariaSmith).getCompare((Hufflepuff) sedrikDiggory);
        ((Ravenclaw) chzhowChang).getCompare((Ravenclaw) padmaPatil);
        ((Slytherin) dracoMalfoy).getCompare((Slytherin) grahamMontegy);
        garryPotter.getCompareGeneral(dracoMalfoy);

    }
}