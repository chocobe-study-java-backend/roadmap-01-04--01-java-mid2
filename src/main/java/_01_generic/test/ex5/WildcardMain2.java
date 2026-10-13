package _01_generic.test.ex5;

import _01_generic.animal.Animal;
import _01_generic.animal.Cat;
import _01_generic.animal.Dog;

public class WildcardMain2 {

    static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);

        // 타입 하한 조건 불일치
        // writeBox(dogBox);

        // 타입 하한 조건 불일치
        // writeBox(catBox);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
