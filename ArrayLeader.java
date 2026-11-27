//ArrayLeader
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<> ();
        int maxRight = arr[ arr.length - 1];
        result.add(maxRight);
        for(int i = arr.length - 2; i>= 0 ; i--){
            if(arr[i] >= maxRight){
                result.add(arr[i]);
                maxRight=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
