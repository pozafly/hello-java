package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());  // m1.hashCode() = 1867083167
        System.out.println("m2.hashCode() = " + m2.hashCode());  // m2.hashCode() = 885284298
        System.out.println("m1.equals(m2) = " + m1.equals(m2));  // m1.equals(m2) = false

        set.add(m1);
        set.add(m2);
        System.out.println(set);  // MyHashSetV2{buckets=[[], [], [], [], [], [], [], [MemberNoHashNoEq{id='A'}], [MemberNoHashNoEq{id='A'}], []], size=2, capacity=10}

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());  // 745160567
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);  // contains = false
    }
}
