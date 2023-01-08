class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
    
		int rem[] = new int[k] ;
		for(int i : arr)
		{
		    rem[i%k]++ ;
		}
		long res = 0;
		for(int i= 0 ;i<k ;i++)
		{
		   res+= (rem[i]-1)*rem[i]/2 ;
		}
		return res ;
	}
}
