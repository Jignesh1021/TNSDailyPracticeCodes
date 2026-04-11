package pack2;

import pack1.AccessBase;

// Child class (inheritance)
public class AccessChild extends AccessBase {

    public void showAccess() {

        // privateVar not accessible
        // privateMethod() not accessible

        System.out.println("Protected Var: " + protectedVar); // allowed
        protectedMethod(); // allowed

        System.out.println("Public Var: " + publicVar); // allowed
        publicMethod(); // allowed
    }

    public static void main(String[] args) {

        AccessChild obj = new AccessChild();

        obj.showAccess();

        // Access via parent object
        AccessBase base = new AccessBase();

        // base.protectedVar not allowed (different package, no inheritance reference)
        System.out.println("Public Var: " + base.publicVar); // allowed
        base.publicMethod(); // allowed

        // Access private using method
        base.accessPrivate(); // indirect access
    }
}