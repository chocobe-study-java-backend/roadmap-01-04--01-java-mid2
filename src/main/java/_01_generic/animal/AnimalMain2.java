package _01_generic.animal;

public class AnimalMain2 {

    static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal animal1 = animalBox.get();
        System.out.println("animal1 = " + animal1);
    }
}
