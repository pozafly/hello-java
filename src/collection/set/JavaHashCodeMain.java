package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());  // 1791741888
        System.out.println(obj2.hashCode());  // 1595428806

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hashCode() = " + i.hashCode()); // 10
        System.out.println("strA.hashCode() = " + strA.hashCode()); // 65
        System.out.println("strAB.hashCode() = " + strAB.hashCode());  // 2081

        // 둘은 같을까 다를까?, 인스턴스는 다르지만, equals는 같음.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2)); // false
        System.out.println("(member1.equals(member2)) = " + (member1.equals(member2))); // true
        System.out.println("member1.hashCode() = " + member1.hashCode());  // 104070
        System.out.println("member2.hashCode() = " + member2.hashCode());  // 104070System.out.println("member1.hashCode() = " + member1.hashCode());  // 104070
        System.out.println("member2.hashCode() = " + member2.hashCode());  // 104070
    }
}
