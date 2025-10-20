public class StringLearning {
    public static void main(String args[]) {
        String s1 = "Dex";
        String s2 =  "Dex";

        // these are not two diffrent variables these are same pointing to same refernce because of concept called string constant pool in java where strings are stored by value in a constant pool in heap memory.
        s2 = "dex"; // this is different

        // In java there are two types of strings
        // Immutable and mutable
        // now normal strings are called immutable
        s1= "Deepanshu";
        System.out.println(s1);

        // mutable strings are made using string buffer
        StringBuffer s3 = new StringBuffer("Anandita");
        s3.append(" " + s2);
        // s2.append() this is an error as String has no method named append
        System.out.println(s3);
        System.out.println("length of string s3 "+s3.length());
        System.out.println("Capacity of string buffer"+s3.capacity());
    }
}