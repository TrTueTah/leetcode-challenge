import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    // Solution 1: Brute-force Method
    // public int longestConsecutive(int[] nums) {
    //     int res = 0;
    //     Set<Integer> store = new HashSet<>();
    //     for(int num : nums) {
    //         store.add(num);
    //     }

    //     for(int num : nums) {
    //         int streak = 0, curr = num;
    //         while(store.contains(curr)) {
    //             streak++;
    //             curr++;
    //         }
    //         res = Math.max(res, streak);
    //     }
    //     return res;
    // }

    // Solution 2: Sorting Method
    // public int longestConsecutive(int[] nums) {
    //     if (nums.length == 0) {
    //         return 0;
    //     }
    //     Arrays.sort(nums);
    //     int res = 0, curr = nums[0], streak = 0, i = 0;

    //     while (i < nums.length) {
    //         if (curr != nums[i]) {
    //             curr = nums[i];
    //             streak = 0;
    //         }
    //         while (i < nums.length && nums[i] == curr) {
    //             i++;
    //         }
    //         streak++;
    //         curr++;
    //         res = Math.max(res, streak);
    //     }
    //     return res;
    // }

    // Solution 3: HashSet
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int num : nums) {
            store.add(num);
        }

        int longest = 0;
        for(int num : store) {
            if(!store.contains(num - 1)) {
                int length = 1;
                while(store.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
