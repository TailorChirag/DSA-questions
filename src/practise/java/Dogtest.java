package practise.java;

public class Dogtest {
    public static void main(String[] args){
//       d1,d2 -> object re -> stack
//        Dog d1=new Dog();

        // Heap
//        d1.name="tuffy";
//        d1.breed="pug";
//        d1.age=5;

//        Dog d2=new Dog();
//        d2.name="rocky";
//        d2.breed="German Shepherd";
//        d2.age=10;


//        System.out.println(d1.name);
//        System.out.println(d1.breed);
//        System.out.println(d1.age);
//        System.out.println(d2.name);
//        System.out.println(d2.breed);
//        System.out.println(d2.age);




        Dog d1=new Dog("tuffy","pug",5 );
        Dog d2=new Dog("Rocky","german shepherd");

        Dog d3=d1;
        d3.setAge();
        System.out.println(d3.getAge());
        System.out.println(d1.getAge());
//        d2.age=7; // more risky
            /*
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        d1.introduce();
        d2.introduce();
                    */

    }
}
