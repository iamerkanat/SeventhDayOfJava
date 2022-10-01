package ClassWork;

public class Dog extends animal {
    String voice;
    String food;
    public Dog(int age, String voice, String food){
        super("Lapus", age);
        this.food = food;
        this.voice = voice;

    }

    @Override
    void eat() {
        super.eat();
    }
}