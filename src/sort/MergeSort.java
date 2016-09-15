package sort;

public class MergeSort {
    
    int[] helper;
    
    public void sortColors(int[] nums) {
        helper = new int[nums.length];
        sort(nums);
    }
    
    private void sort(int[] nums){
        mergesort(nums, 0 , nums.length -1);
    }
    
    private void mergesort(int[] nums, int lo, int hi){
        if(lo >= hi)
            return;
        int mid = (lo + hi) / 2;
        mergesort(nums, lo, mid);
        mergesort(nums, mid + 1, hi);
        merge(nums, lo, mid, hi);
    }
    
    private void merge(int[] nums, int lo, int mid, int hi){
        for (int i = lo; i <= hi; i++) {
          helper[i] = nums[i];
        }
        
        int i = lo;
        int j = mid + 1;
        int k = lo;
        
        while(i <= mid && j <= hi){
            if(helper[i] <= helper[j]){
                nums[k] = helper[i];
                i++;
            }else{
                nums[k] = helper[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
          nums[k] = helper[i];
          k++;
          i++;
        }
        
        while (j <= hi) {
          nums[k] = helper[j];
          k++;
          j++;
        }
    }
}