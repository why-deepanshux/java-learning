public class Demo {
    public static void main(String a[]){
        int[] nums = {1,2,3};  // this is a way to define arrays in java
        int nums1[] = {1,2,3}; // another way
        int nums2[] = new int[4];

        // for loop to print java array elements
        for(int i=0;i<4;i++){
            System.out.println(nums2[i]);
        }
        // for loop to add elements in
        // System.out.println(nums);
        for(int i=0; i<4; i++){
            nums2[i]=(int)Math.ceil(Math.random()*10);
            // type casting
            System.out.println(nums2[i]);
        }
        return;
    }
}
