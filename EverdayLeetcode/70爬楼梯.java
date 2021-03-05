class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int pre1 = 1,pre2 = 2, res = 0;
        for(int i = 3;i<=n;i++){
            res = pre1 + pre2;
            pre1 = pre2;
            pre2 = res;

        }
        return res;

        

    }
}
