//stock buy and sell 
import java.util.Scanner;
public class stockbuyandsell{
  public int maxProfit(int [] prices){
    if(prices==null || prices.length==0){
      return 0;
    }
     int minprice = prices[0] ;
    int maxprofit = 0;
    for(int i = 1;i<prices.length;i++){
      int profit = prices[i] - minprice;
      if(profit > maxprofit){
        maxprofit = profit;
      }
      if(minprice > prices[i]){
        minprice = prices[i];
      }
    }
    return maxprofit;
  }
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of days:");
  int n = sc.nextInt();
  int [] prices = new int[n];
  System.out.println("Enter stock prices:");
  for(int i =0;i<n;i++){
    prices[i] = sc.nextInt();
  }
  stockbuyandsell obj = new stockbuyandsell();
  System.out.println("Max Profit:"+obj.maxProfit(prices));
  sc.close();
}
}
  
