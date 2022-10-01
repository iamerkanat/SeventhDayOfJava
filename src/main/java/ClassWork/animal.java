package ClassWork;

public class animal {
    String type;
    int age;

    public animal(String type, int age){
        this.type = type;
        this.age = age;
    }

    void eat(){
        System.out.println(type + " I am eating");
    }


}