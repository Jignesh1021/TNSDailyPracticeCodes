package pack2;

import pack1.BaseClass;

public class NonChildDemo {

    public static void main(String[] args) {

        BaseClass obj = new BaseClass();

        // System.out.println(obj.value); not allowed
        // obj.display(); not allowed
    }
}