package pack2;

import pack1.BaseClass;

public class ChildClass extends BaseClass {

    public void showAccess() {

        System.out.println(value); // allowed
        display(); // allowed
    }

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
        obj.showAccess();
    }
}