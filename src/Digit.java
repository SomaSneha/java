/* Add all elements of array to a single digit*/

public class Digit{
public static void main(String[] args){
   int[] num={12,17,21,48,15};
   int sum=0,digit=0;
   for(int i=0;i<num.length;i++){
          sum=sum+num[i];
   }
   while(sum>0){
        digit=digit+(sum%10);
		sum=sum/10;
		if(sum==0 && digit>9){
		  sum=digit;
		  digit=0;
		}
   }
System.out.print(digit);
}
}