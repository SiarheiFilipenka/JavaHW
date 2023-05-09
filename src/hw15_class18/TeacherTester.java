package hw15_class18;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("John Wick", "Killer", 46, 1200000.0);
        MathTeacher mathTeacher = new MathTeacher("Amy Elia", "Math", 50, 70000.0);
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Kevin Carrington", "Chemistry", 42, 60000.0);
        PianoTeacher pianoTeacher = new PianoTeacher("Daisy Marie", "Piano", 26, 45000.0);

        teacher.printInfo();
        teacher.letMeIntroduce();
        teacher.lesson();
        teacher.classTopic();
        System.out.println("==================================================");
        mathTeacher.printInfo();
        mathTeacher.letMeIntroduce();
        mathTeacher.lesson();
        mathTeacher.classTopic();
        System.out.println("==================================================");
        chemistryTeacher.printInfo();
        chemistryTeacher.letMeIntroduce();
        chemistryTeacher.lesson();
        chemistryTeacher.classTopic();
        System.out.println("==================================================");
        pianoTeacher.printInfo();
        pianoTeacher.letMeIntroduce();
        pianoTeacher.lesson();
    }
}
