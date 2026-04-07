package secondpackage;

import firstpackage.Base;

public class Executor {

    public static void main(String[] args) {
        
        Base b1 = new Base();
        b1.methodPublic();
        
        b1.varPublic = 123456;
        b1.methodPublic();

        // b1.methodProtected(); not allowed here
    }
}