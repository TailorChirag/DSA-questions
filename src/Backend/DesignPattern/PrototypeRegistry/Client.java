package Backend.DesignPattern.PrototypeRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        registerStudents(studentRegistry);

        Student chika = studentRegistry.get("aug_Lld_Student").clone();
        chika.setName("Chika");
        chika.setAge(22);
        chika.setStudentPsp(80.0);

        Student intelligentchika = studentRegistry.get("Intelligent_aug_lld_Student").clone();
        intelligentchika.setName("Intelligent Chika");
        intelligentchika.setAge(23);
        intelligentchika.setStudentPsp(100.0);

        System.out.println(intelligentchika);
        System.out.println(chika);
    }

    public static void registerStudents(StudentRegistry studentRegistry){
        Student augLldStudent = new Student();
        augLldStudent.setBatch("Aug_Lld_Student");
        augLldStudent.setAvgBatchPsp(90.0);
        studentRegistry.register("aug_Lld_Student",augLldStudent);

        IntelligentStudent is = new IntelligentStudent();
        is.iq = 140;
        is.setBatch("Aug bacth");
        is.setAvgBatchPsp(90.0);
        studentRegistry.register("Intelligent_aug_lld_Student",is);

    }
}
