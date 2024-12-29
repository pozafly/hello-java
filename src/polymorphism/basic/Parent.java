package polymorphism.basic;

import java.util.Objects;

public class Parent {
    public String value = "Parent";

    public void method() {
        System.out.println("Parent.parentMethod");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return Objects.equals(value, parent.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
