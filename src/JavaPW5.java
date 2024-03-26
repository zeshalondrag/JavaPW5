public class JavaPW5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Собака:");
        dog.eat();
        dog.sound();
        dog.play();

        System.out.println("\nКот:");
        cat.eat();
        cat.sound();
        cat.play();
    }
}