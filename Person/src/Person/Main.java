package Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pocz¹tek programu");
             Student student = new Student(20 , "Jakub");
        System.out.println("Imie studenta to " + student.GetName());
             student.SetName("Piotr");
        System.out.println("Imie studenta to " + student.GetName());
        Teacher teacher = new Teacher(30 , "Jan" , "555-333-444");
        System.out.println("Kontakt nauczyciela to " + teacher.GetContactNumber());
        System.out.println("Imie nauczyciela to " + teacher.GetName());
        teacher.SetName("Katarzyna");
        System.out.println("Imie nauczyciela to " + teacher.GetName());
        
        teacher.SetAge(100);
    }
}