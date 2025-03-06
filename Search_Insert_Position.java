/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

// code with O(n) Time Complexity 
class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i] < target && (i == nums.length - 1 || target < nums[i + 1])){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Search_Insert_Position obj=new Search_Insert_Position();
        int nums[]={1,3,5,6};
        int target=7;
        System.out.println(obj.searchInsert(nums,target));
    }
}

// Code with O(log(n)) Time Complexity 

class Search_Insert_Position{
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target){
                left=mid+1;
            } else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Search_Insert_Position obj=new Search_Insert_Position();
        int nums[]={1,3,5,6};
        int target=2;
        System.out.println(obj.searchInsert(nums,target));
    }
}
