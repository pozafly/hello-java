package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();  // 생성 시점에 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("문자100");  // Integer 타입만 허용, 컴파일 오류
        System.out.println("integer = " + integerBox.get());  // Integer 타입 반환(캐스팅 X)

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        System.out.println("string = " + stringBox.get());
    }
}
