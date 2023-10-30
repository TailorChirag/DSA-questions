package Backend.CopyCostructor;

public class Student {
    int age;
    String name;
    public Student(int age,String name){
        this.age = age;
        this.name =name;
    }
    public Student(Student st){
        age = st.age;
        name = st.name;
    }

    public void getAge(){
        System.out.println("age :" + this.age);
    }
}
