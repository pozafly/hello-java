package collection.array;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println(list);

        System.out.println("==데이터 추가==");
        list.add("a");
        System.out.println(list);

        list.add("b");
        System.out.println(list);

        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("d");
        list.add("e");
        System.out.println(list);

        // 범위 초과, capacity가 늘어나지 않으면 예외 발생
        list.add("f");  // ArrayIndexOutOfBoundsException 하지만, capacity를 늘려주면 된다.
        System.out.println(list);
    }
}
