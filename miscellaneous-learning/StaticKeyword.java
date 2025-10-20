public class StaticKeyword {
    public static void main(String args[]) {
        Demo obj1 = new Demo();
        obj1.val = 10;
        obj1.name = "Dex";

        System.out.println("Obj1");
        obj1.show();
        
        Demo obj2 = new Demo();
        obj2.name="Deepanshu";
        obj2.val= 12;

        System.out.println("Obj1");
        obj1.show();
        System.out.println("Obj2");
        obj2.show();

        NDPSStudent stud1 = new NDPSStudent();
        stud1.name="Suyash";
        stud1.Show();
    }
}

class Demo {
    int val ;
    static String name ;

    public void show() {
        System.out.println("Val "+ val+" name "+name);
    }
}
class NDPSStudent {
    // instance variable 
    String name;
    int rollNo;
    static String schoolName;
    // static block where you assign variable value
    static{
        schoolName = "North Delhi Public School";
    }

    public void Show() {
        System.out.println("Name of the student "+name);
        System.out.println(schoolName);

    }

}