import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws IOException, InterruptedException {

		int count =0;
		{File file = new File("data/data1.txt");   //이 위치에 있는 파일을 오픈하다.
		FileInputStream src= new FileInputStream(file);   // 여기에 읽어서 올려둔다.
		Scanner sc = new Scanner(src);     //읽는다.
		
		while(sc.hasNext()) {     //문장이 있는동안
			String tmp = sc.next();    
			System.out.printf("%s ",tmp);//찍어낸다
			count++;
		}
		System.out.println("\ncount: " + count);
		
		sc.close();
		src.close();
		}
		int [] nums = new int[count];
		
		{File file = new File("data/data1.txt");   //이 위치에 있는 파일을 오픈하다.
		FileInputStream src= new FileInputStream(file);   // 여기에 읽어서 올려둔다.
		Scanner sc = new Scanner(src);     //읽는다.
			
		for(int i=0; i<count; i++) {
		String tmp = sc.next();
		nums[i] = Integer.parseInt(tmp);
		}
		System.out.println("nums : " + Arrays.toString(nums));
		sc.close();
		src.close();
		}
		{
		int index = -1;
		for(int i =0; i<count; i++)
			if(88== nums[i]) {
				index =i;
				break;
			}
			System.out.println("index : " + index);
			
			{
			int tmp;
			tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
			System.out.println("nums : " + Arrays.toString(nums));
			}
			
//			for(int i=0; i<count-1; i++) {
//			int tmp;
//			tmp = nums[i];
//			nums[i] = nums[i+1];
//			nums[i+1] = tmp;
//			Thread.sleep(500);
//			for(int j=0; j<1; j++)
//				System.out.println();
//			for(int j=0; j<count; j++)
//				if(j==i+1)
//					System.out.printf("[%d]", nums[j]);
//				else
//					System.out.printf("%d ", nums[j]);
//			}
		}
	}
}