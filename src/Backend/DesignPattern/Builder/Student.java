package Backend.DesignPattern.Builder;

public class Student {
    String name;
    int age;
    String UniversityName;
    double psp;
    String address;

    public Student(Builder builder){
        //validations start
        if(builder.getAge()<21){
            throw new IllegalArgumentException("Age is Less then 21");
        }
        // Validation end
        name = builder.getName();
        age = builder.getAge();
        UniversityName = builder.getUniversityName();

    }
}
