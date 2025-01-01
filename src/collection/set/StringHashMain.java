package collection.set;

public class StringHashMain {
    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';

        int hashCode = hashCode("AB");
        System.out.println("hashCode = " + hashCode);
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }
}
