//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            
            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());
        
            int arr[] = new int[(int)(N)];
            
            String inputLine2[] = br.readLine().trim().split(" ");
            for ( i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine2[i]);
            }
        
            Solution ob = new Solution();
            System.out.println(ob.minIncrements(arr,N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<N;i++) {
            if(set.contains(arr[i])) {
                al.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }

        if(al.size()<1){
            return 0;
        }

        long count = 0;
        int len = al.size();
        
        for(int i=0; i<len; i++) {
            boolean flag=true;
            int k = al.get(i);
            while(flag) {
                k++;
                count++;
                if(!set.contains(k)) {
                    set.add(k);
                    flag=false;
                }
            }
        }

        return count;
    }
}
