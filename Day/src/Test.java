import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int x=2500;
//		int age = (int)(Math.random()*100);
		double rate = 0.0;
		
		System.out.print("나이(0~100)를 입력해주세요: ");

		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		
		if(age<=3 || age>=65) 
			rate = 0;
		else if(age>=20)
			rate = 1;
		else if(age>=14)
			rate=0.75;
		else if(age>=4)
			rate=0.5;
		
			System.out.println("나이: " + age + ",요금: "+(int)(x*rate));
	}
}