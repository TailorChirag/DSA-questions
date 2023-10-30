package Backend.DesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(20);
        builder.setName("Chirag");
        builder.setUniversityName("Scaler");
        Student student = new Student(builder);
        System.out.println(student.name + "\n" +student.age);
    }
}
