//  Leetcode : https://leetcode.com/problems/subsets/

// given nums array  we need to find total possible subsets using that array

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num:nums){
            int n=res.size();
            for (int i=0;i<n;i++){
                List<Integer> cur=new ArrayList<Integer>(res.get(i));
                cur.add(num);
                res.add(cur);
            }
        }

        return res;
    }
}
