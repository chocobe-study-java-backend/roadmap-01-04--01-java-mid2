package _01_generic.animal;

public class AnimalMain1 {

    static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);

        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);

        Cat cat1 = catBox.get();
        System.out.println("cat1 = " + cat1);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);

        Animal animal1 = animalBox.get();
        System.out.println("animal1 = " + animal1);
    }
}
