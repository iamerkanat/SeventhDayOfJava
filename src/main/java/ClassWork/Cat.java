package ClassWork;

public class Cat extends animal{
    int nails;
    public Cat(String type, int age, int nails) {
        super(type, age);
        this.nails = nails;
    }

    @Override //polimorfizm pereopredelenie
    void eat() {
        super.eat();
    }
}
