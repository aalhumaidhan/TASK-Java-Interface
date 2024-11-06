public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("This dog is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("This dog is barking.");
    }

    @Override
    public void sleep() {
        System.out.println("This dog is sleeping.");
    }
}
