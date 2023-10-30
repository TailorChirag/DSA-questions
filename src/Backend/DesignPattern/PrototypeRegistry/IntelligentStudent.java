package Backend.DesignPattern.PrototypeRegistry;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent clone(){
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.iq = this.iq;

        return new IntelligentStudent(this);

    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }
}
