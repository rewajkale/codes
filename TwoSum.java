public class Solution 
{
    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> h=new HashMap();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(target-nums[i]))
            {
                h.put(nums[i],i+1);
            }
            else
            {
                if((target%2==0)&&(nums[i]==target/2))
                {
                    arr[0]=h.get(target-nums[i]);
                    arr[1]=i+1;
                    break;
                }
                if(h.containsKey(target-nums[i]))
                {
                    arr[0]=h.get(target-nums[i]);
                    arr[1]=i+1;
                    break;
                }
            }
        }
        return arr;
    }
}
