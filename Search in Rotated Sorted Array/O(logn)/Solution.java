class Solution
{
  public int search(int[] nums, int target)
  {
    int result = -1, low = 0, high = nums.length-1;

    // Use bianry search to find the index of the smallest value
    while(low < high)
    {
      int middle = (low + high)/2;
      if(nums[middle] > nums[high])
      {
        low = middle+1;
      }
      else
      {
        high = middle-1;
      }
    }

    // Set the shift value and reset the high and low
    int shift = low;
    low = 0;
    high = nums.length-1;

    // Use shifted binary search to find the result
    while(low <= high)
    {
      int middle = (low + high)/2;
      int realMid = (middle + shift) % nums.length;
      if(nums[realMid] == target)
      {
        result = realMid;
        break;
      }
      else if(nums[realMid] < target)
      {
        low = middle+1;
      }
      else
      {
        high = middle-1;
      }
    }
    return result;
  }
}