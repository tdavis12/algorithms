class Solution {
  public int search(int[] nums, int target) {
    int result = -1;

    // Loop through the list looking for target
    for(int i = 0; i < nums.length; i++) {

      // If target found, return location
      if(nums[i] == target) {
        result = i;
        break;
      }
    }
    return result;
  }
}
