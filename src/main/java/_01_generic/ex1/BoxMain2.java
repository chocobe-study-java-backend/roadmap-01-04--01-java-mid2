package _01_generic.ex1;

public class BoxMain2 {

    static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        // Object => Integer 다운 케스팅
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");

        // Object => String 다운 케스팅
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        integerBox.set("문자100");
    }
}
