package practise.java;

public class Dog {
    private String name;
    String breed;
    private int age;

   Dog(){
       System.out.println("creating a Dog");
   }
   // parameterised Constructor
    Dog(String name,String breed){
       this.name=name;
       this.breed=breed;
       age= 1;
    }
    Dog(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age= age;
    }

    // getter
    String getName(){
       return name;
    }
// setter
    void setAge(){
       // put my validation logic
        if(age>0){
            this.age=age;
        }
        else{
            this.age=1;
        }
    }

    int getAge(){
       return age;
    }

    void introduce(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
    }


}
