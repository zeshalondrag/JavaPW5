public class Dog implements Pet{
    @Override
    public void eat() {
        System.out.println("Кушает корм");
    }
    @Override
    public void sound() {
        System.out.println("Гав!");
    }
    @Override
    public void play() {
        System.out.println("Играет с мячиком");
    }
}