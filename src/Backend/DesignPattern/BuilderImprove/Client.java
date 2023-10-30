package Backend.DesignPattern.BuilderImprove;



public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                                .setAge(23)
                                .setName("Chirag")
                                .setUniversityName("Scaler")
                                .setPsp(100.00)
                                .setAddress("Jawahar nagar,Jaipur")
                                .build();
        System.out.println(student);
    }
}
