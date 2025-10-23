class A {
    int a;
    A(){
        System.out.println("In A class contructor");
        a=5;
    }

    void show() {
        System.out.println("I am a function of class A");
    }
}

class B extends A {
    int b;
    B() {
        System.out.println("In B class constructor");
    }

    void show() {
        System.out.println("I am a function of class B");
    }
}

// multiple inheritance 
class C {
    void show(){
        System.out.println("In class C");
    }
}

class D extends C {
    void show(){
        System.out.println("In class D");
    }
}

// enum is also class
enum Status {
    // objects
    Running(200) , Failed(500) , Pending(400) , Success(200);

    // since its a class we can make a class variable 
    private int code;
    // so now every object will have its own property variable called price , but they can't be directly accessed 
    Status(int code) {
        this.code = code; 
    }

    void printCode() {
        System.out.println(this.code);
    }
}

public class OopsLearning {
    public static void main(String args[]) {
        A objA = new A();
        B objB = new B();
        A objAB = new B();
        objAB.show();

        int num1 = 4;
        Integer num = num1; // auto boxing
        int num2 = num; // auto unboxing

        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        switch (s) {
            case Status.Running:
                System.out.println("Its working");
                break;

            default:
                break;
        }
        s.printCode();
        
    }
}
