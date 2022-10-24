public class ArrayNews {

    public static void main(String[] args) {

        int[] nums = {75, 29, 350, 7, 4192, 204, 1100, 67};

        for (int i=0; i < nums.length; i++)  {
             if (nums[i] > 100) {
                System.out.println(nums[i]);
            }
        }
    }

}