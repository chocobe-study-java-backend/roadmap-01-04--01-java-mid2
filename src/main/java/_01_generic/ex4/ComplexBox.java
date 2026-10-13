package _01_generic.ex4;

import _01_generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    public T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("z.className = " + z.getClass().getName());
        return z;
    }
}
