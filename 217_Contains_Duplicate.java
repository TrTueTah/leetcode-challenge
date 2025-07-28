import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    // Using HashSet Method
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<Integer>();
        for (int num : nums) {
           if (store.contains(num)) return true;
           store.add(num);
        }
        return false;

    }
    // Using Sorting Method
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);

    //     for(int i = 0; i < nums.length - 1; i++) {
    //         if( nums[i] == nums[i + 1] ) return true;
    //     }
    //     return false;
    // }
}