package _02_collection._04_set;

public class StringHashMain {

    static final int CAPACITY = 10;

    static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + charB);

        // hashCode
        int hashCode = hashCode("A");
        System.out.println("hashCode(%s) = %d".formatted("A", hashCode("A")));
        System.out.println("hashCode(%s) = %d".formatted("B", hashCode("B")));
        System.out.println("hashCode(%s) = %d".formatted("AB", hashCode("AB")));

        // hashIndex
        int hashCodeA = hashCode("A");
        int hashIndexA = hashIndex(hashCodeA);
        System.out.println("hashIndexA = " + hashIndexA);

        System.out.println("hashIndex(%s) = %d".formatted("A", hashIndex(hashCode("A"))));
        System.out.println("hashIndex(%s) = %d".formatted("B", hashIndex(hashCode("B"))));
        System.out.println("hashIndex(%s) = %d".formatted("AB", hashIndex(hashCode("AB"))));
    }

    static int hashCode(String str) {
        char[] chars = str.toCharArray();
        int hashCode = 0;

        for (char c : chars) {
            hashCode += c;
        }

        return hashCode;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
