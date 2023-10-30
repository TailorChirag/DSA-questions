package Backend.DesignPattern.BuilderImprove;

public class Student {
    String name;
    int age;
    String UniversityName;
    double psp;
    String address;

    private Student(Builder builder){

        name = builder.getName();
        age = builder.getAge();
        UniversityName = builder.getUniversityName();
        psp = builder.getPsp();
        address = builder.getAddress();

    }
    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;
        private String UniversityName;
        private double psp;
        private String address;

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return UniversityName;
        }

        public Builder setUniversityName(String universityName) {
            UniversityName = universityName;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            //validations start
            if(this.getAge()<21){
                throw new IllegalArgumentException("Age is Less then 21");
            }
            if(this.getName().equals(""))
                throw new IllegalArgumentException("Name is empty");
            // Validation end
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", UniversityName='" + UniversityName + '\'' +
                ", psp=" + psp +
                ", address='" + address + '\'' +
                '}';
    }
}

