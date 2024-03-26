public class Cat implements Pet{
    @Override
    public void eat() {
        System.out.println("Кушает вискас");
    }
    @Override
    public void sound() {
        System.out.println("Мяу!");
    }
    @Override
    public void play() {
        System.out.println("Играет с мышкой");
    }
}