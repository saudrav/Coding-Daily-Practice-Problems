class Solution {
    int solve(int N, int[] A) {
        // code here        
        for(int i=N-1; i>0; i--) {
            if(A[i]>8) {
                continue;
            } else {
                return i+1;
            }
        }
        return 0;
    }
}
