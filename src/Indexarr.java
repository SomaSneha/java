/* WAP to copy elements from first array to second considering elements as index */

public class Indexarr{
public static void main(String[] args){
    int[] x={3,9,6,1,8};
	int[] y=new int[x.length];
	int i,j;
	//System.out.print(x.length);
    for(i=0,j=4;i<x.length;i++,j--){
	    y[j]=x[i];
		
	}
    for(i=0;i<=4;i++){
	System.out.print(y[i]);
	}
}
}