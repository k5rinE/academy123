import java.util.*;
public class Test4 {
	
	/*
	 *   void add(int i , int j)  ->함수 정의(몸체)
	 *   반환형 함수이름 매개변수
	 *     |
	 * 	   |    void는 반환겂이 없다.
	 *   void는 반환값이 없다.
	 *   int 정수형 int를 리턴한다.
	 *   double
	 *   
	 *   add(10,20,) ==> 함수 호출
	 *   함수이름(인자,인자)
	 *   
	 *   1. 인자0, 반환0, 2.인자0, 반환, 3. 인자x, 반환0, 4. 인자x, 반환x
	 *   
	 *   >> 두 정수를 더하는 기능으로 함수 표현
	 */
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		char input = add(age);

		System.out.println("");
	}
	//public 다른곳에서도 쓸수있음, private는 이곳에서만 쓸수있음.
	//위에add( )가 아래 add( )함수로 들어간다 (타입일치)
	//아래add(i,j)와 return i,j(타입일치)
	//위에 int num이랑 아래 int add(타입일치)
	static int add(int i, int j) {
		return i+j;
	
	}
	
}
		