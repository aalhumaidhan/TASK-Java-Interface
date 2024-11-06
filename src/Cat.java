public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("This cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("This cat is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("This cat is meowing.");
    }
}
