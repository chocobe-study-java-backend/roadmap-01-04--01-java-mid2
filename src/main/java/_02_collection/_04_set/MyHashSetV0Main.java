package _02_collection._04_set;

public class MyHashSetV0Main {

    static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        boolean result = set.add(4); // 중복 데이터 저장
        System.out.println("중복 데이터 저장 결과: " + result);

        System.out.println("set.contains(3): " + set.contains(3));
        System.out.println("set.contains(99): " + set.contains(99));
    }
}
