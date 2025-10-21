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


public class OopsLearning {
    public static void main(String args[]) {
        A objA = new A();
        B objB = new B();
        A objAB = new B();
        objAB.show();

        int num1 = 4;
        Integer num = num1; // auto boxing
        int num2 = num; // auto unboxing
    }
}
