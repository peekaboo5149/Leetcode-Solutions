import java.util.*;

public class Arrays {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            res[i] = sum;
        }
        return res;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];

        for (int i = 0; i < candies.length; i++)
            if (candies[i] > max)
                max = candies[i];

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;
    }

}
