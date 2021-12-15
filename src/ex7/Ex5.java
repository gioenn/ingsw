package ex7;

public class Ex5 {
    /*
        @requires nums != null && highs != null & n > 0
                    && highs.length == n && nums.length >= n
                    && (\forall int i; 0 <= i < nums.length;
                    (\numof int j; i < j < nums.length; nums[i] == nums[j]) == 0)
        @ensures (\forall int i; 0 <= i < highs.length-1; highs[i] > highs[i+1]) &&
            (\forall int j; 0 <= j < highs.length; (j ==
                (\numof int i; 0 <= i < nums.length; highs[j] < nums[i]) &&
                 (\exists int i; 0 <= i < nums.length; highs[j] == nums[i])))
        @ensures (\forall int i; 0 <= i < highs.length-1; highs[i] > highs[i+1]) &&
            (\forall int i; 0 <= i < highs.length;
                (\exists int j; 0<=j<nums.length; highs[i] < nums[j]) =>
                (\exists int k; 0 <= k < highs.length; highs[k] == nums[j] ))

        @assignable highs[*]

     */
    public static void highLowNums(int[] nums, int[] highs, int n){}
}
