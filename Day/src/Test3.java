import java.util.Arrays;

public class Test3 {
	
	public static void main(String[] args) {
		int [] nArr = {0,1,2,3,4,5,6,7,8,9};
	
		for(int i=0; i<nArr.length-1; i++) {
		
			int index=i;
			
			for(int j=i+1; j<nArr.length; j++) {
				if(nArr[index] > nArr[j]) index= j;
			}
			
			if(index !=i) {
				int tmp =nArr[index];
				nArr[index]=nArr[i];
				nArr[i]=tmp;
			}
			System.out.println((i+1) + "회전" + Arrays.toString(nArr));
		}		
		System.out.println(Arrays.toString(nArr));
	}
}
		