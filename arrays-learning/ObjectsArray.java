class Student {
    String name;
    int age;
    int marks;
}

public class ObjectsArray {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Deepanshu";
        s1.marks = 30;
        s1.age = 21;

        Student s2 = new Student();
        s2.name="Dex";
        s2.marks = 32;
        s2.age = 22;

        Student students[] = new Student[2];
        students[0]=s1;
        students[1]=s2;
        for(Student stud : students ){
            System.out.println(stud.name);
        }
    }
}

