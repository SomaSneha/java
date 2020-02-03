/* search a given number in an array and print its position */

import java.util.Scanner;
public class Searcharr {
 public static void main(String[] args) {
	int x[]=new int[5];
	int i;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 5 nos:");
	for(i=0;i<x.length;i++) {
		x[i]=sc.nextInt();
	}
	System.out.println("Enter a no you want to search: ");
	int num=sc.nextInt();
	sc.close();
	for(i=0;i<x.length;i++) {
		if(x[i]==num) {
			
			count++;
			break;
		}
	}
	if(count==0) {
	System.out.println("no does not exits");
	}else {
		System.out.println("position: " +(i+1));
	}
}
}
