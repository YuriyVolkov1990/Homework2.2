public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hogwarts!");
        Gryffindor student = new Gryffindor("Гарри Поттер", 100, 100,100,100,100);
        System.out.println("Студент = " + student.getFulldata());
    }
}