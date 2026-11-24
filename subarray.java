//Subarray
class Solution{
  public List<List<Integer>> getSubarrays(int [] arr){
    List<List<Integer>> result = new ArrayList<Integer>();
    for(int i = 0;i<arr.length;i++){
      for(int j = 0;j<arr.length;j++){
        List<List<Integer>>  subarrays = new ArrayList<Integer>();
        for(int k = i ; k<=j;k++){
          subarrays.add(arr[k]);
        }
            result.add(subarrays);

      }
    } 
    return result;
  }
}
    
