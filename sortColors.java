// Brute Force: Merge Sort
//Better: Count 0's 1's 2's and replace the complete array.

//Optimal
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        int temp=-1;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        return;
        
    }
}
