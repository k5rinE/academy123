import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int sum = 0;
		int average = 0;
		int count = 0;
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
			
		System.out.println("총합: "+sum);
		System.out.println("평균: "+(float)sum/100);
		System.out.println("==================");
		
		sum=0;
		
		for(int i=1; i<=101; i++) {
			if(i%2==0 && i%7==0) {
				count++;
				sum+=i;
				System.out.print(i +" ");
			}
		}
		System.out.println();
		System.out.println("중복배수의 개수: "+ count);
		System.out.println("중복배수의 총합: "+ sum);
		System.out.println("==================");
		sum=0;
		count=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0 && i%7==0)   
				count++;
		}
		int [] tmp = new int [100];
		int j=0;
			int [] tmp2 = new int [count];
			
			for(int i=1; i<tmp.length; i++) {
				if(i%2==0 && i%7==0)   
					tmp2[j++]=i;
			
	}
		System.out.println(Arrays.toString(tmp2));

}
}