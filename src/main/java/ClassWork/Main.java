package ClassWork;

public class Main {

    public static void main(String[] args) {
        animal lion = new animal("Leo", 25);
        animal lion2 = new animal("Leo", 25);
        // System.out.println(lion.equals(lion2)); //false because different hash codes

        Cat kitty = new Cat("Mimi", 5, 9);
        Dog doggy = new Dog(7, "gavgav", "kost");


        animal animals[] = {lion, kitty, doggy};
        for(animal animal1 : animals){
            //if (animal1 instanceof Dog){
                animal1.eat();
            }
        }
        // object
        //parent of all classes
        //text.toString();
    }
