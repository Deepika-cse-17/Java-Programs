// Reversing a group of array 
class solution{
  public void reverseInGroups(int[] arr, int k)
  {
    for(int i = 0; i<arr.length;i++){
      int left = i;
      int right = Math.min(i+k-1,arr.length-1);
      while(left<right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=arr[left];
        left++;
        right--;
      }
    }
  }
}
