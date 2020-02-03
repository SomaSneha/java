/* WAP to count and print vowels from given array */

public class Vowels {
public static void main(String[] args) {
	char[] a= {'a','5','i','}','u'};
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U') {
			//System.out.println("vowel");
			count++;
		}
			if(count>0) {
			System.out.println("vowel: " +a[i]);
			}
		}
		System.out.println("There are "+count+" vowels");
	}
}

