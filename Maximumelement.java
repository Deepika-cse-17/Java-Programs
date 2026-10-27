//Maximum Element in the array 
public class main{
  public static void main(String args[]){

//declaration of the array 
    int[] arr={10,20,30,40,50};
    int maximum = arr[0];

    for(int i = 1;i<arr.length;i++){
         if(arr[i]> maximum){
            maximum = arr[i];
         }
     }
  System.out.println("Maximum element in the array :"+ maximum);
 }
}
