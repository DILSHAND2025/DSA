class Solution {
    public int[] runningSum(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        int sum=arr[0];
        arr1[0]=arr[0];
        for(int i=1;i<n;i++){
            sum+=arr[i];
            arr1[i]=sum;
        }
        return arr1;
    }
}