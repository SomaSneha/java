/* WAP to sort given array in acending order */

public class Ascending {
public static void main(String[] args) {
	int x[]= {3,5,1,7,8,2};
	int i,j;
	for(i=0;i<x.length;i++) {
		for(j=i+1;j<x.length;j++) {
			if(x[i]>x[j]) {
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
		
	}
	for(i=0;i<x.length;i++) {
		System.out.print(x[i]);
	}
}
}
