package pack1;

// Base class with all access modifiers
public class AccessBase {

    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    // private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // method to access private members inside same class
    public void accessPrivate() {
        System.out.println("Private Var: " + privateVar);
        privateMethod();
    }
}