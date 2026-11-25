//Alternate positive and negative
import java.util.ArrayList;
import java.util.Scanner;
class Solution{
  void rearrange(ArrayList<Integer> arr){
    ArrayList<Integer> positive = new ArrayList<Integer>();
    ArrayList<Integer> negative = new ArrayList<Integer>();
    for(int i = 0; i<arr.size();i++){
      if(arr.get(i) >=0){
          positive.add(arr.get(i));
      }
      else{
         negative.add(arr.get(i));
      }
    }
    int p = 0;
    int n = 0;
    int index=0;
    while(p<positive.size() && n<negative.size()){
        arr.set(index++,positive.get(p++));
        arr.set(index++,negative.get(n++));
    }
    while(p<positive.size()){
      arr.set(index++,positive.get(p++));
    }
    while(n<negative.size()){
      arr.set(index++,negative.get(n++));
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution sol = new Solution();
    ArrayList<Integer> list = new ArrayList<>;
    System.out.print("Enter the number of elements:");
    int size = sc.nextInt();
    System.out.println("Enter"+ size +"integer:");
    for(int i = 0; i<size;i++){
      list.add(sc.nextInt());
    }
    sol.rearrange(list);
    System.out.println(list);
    sc.close();
  }
}
