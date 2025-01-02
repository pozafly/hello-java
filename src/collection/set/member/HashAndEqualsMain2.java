package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());  // m1.hashCode() = 65
        System.out.println("m2.hashCode() = " + m2.hashCode());  // m2.hashCode() = 65
        System.out.println("m1.equals(m2) = " + m1.equals(m2));  // m1.equals(m2) = false

        set.add(m1);
        set.add(m2);
        System.out.println(set);  // MyHashSetV2{buckets=[[], [], [], [], [], [MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}], [], [], [], []], size=2, capacity=10}

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());  // 65
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);  // contains = false
    }
}
