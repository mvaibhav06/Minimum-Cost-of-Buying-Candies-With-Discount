class MinCost {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int len = cost.length;
        int out = 0;

        int i = len-2;
        int j = len-1;
        // 2,2,5,6,7 - 3i 4j
        while (i>=1){
            out += cost[i]+cost[j];
            i -= 3;
            j -= 3;
        }
        int k = 0;
        while (k<=j){
            out += cost[k];
            k++;
        }
        return out;
    }
}
