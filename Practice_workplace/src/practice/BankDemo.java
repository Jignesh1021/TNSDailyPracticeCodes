package practice;

// Parent class (Base class)
class Bank {

    // Method to return interest rate
    float rate() {
        return 0;
    }
}

// Child class SBI
class SBI extends Bank {

    @Override
    float rate() {
        return 7.0f;
    }
}

// Child class ICICI
class ICICI extends Bank {

    @Override
    float rate() {
        return 7.2f;
    }
}

// Child class HDFC
class HDFC extends Bank {

    @Override
    float rate() {
        return 6.9f;
    }
}

// Main class
public class BankDemo {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI: " + b.rate());

        b = new ICICI();
        System.out.println("ICICI: " + b.rate());

        b = new HDFC();
        System.out.println("HDFC: " + b.rate());
    }
}