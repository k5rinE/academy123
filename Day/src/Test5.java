import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int allDay = 0, startDay = 0, endDay = 0;
		int year = 0, month = 0;

		System.out.println("년도를 입력하세요. ");
		year = scan.nextInt();

		System.out.println("월을 입력하세요. ");
		month = scan.nextInt();

		for (int i = 1; i < year; i++) {//입력한 년도보다 작년까지의 합이 필요함으로 i < year로 사용
			allDay += 365;
			//1년 지날때마다 365씩 더해줌
			if ((((i % 4) == 0) && (i % 100) != 0) || ((i % 400) == 0)) {
				//if문에서 year가 아닌 i를 써주는 이유는 for문에서 1년부터 입력한 year까지의 합을 구해주는 과정이기 때문.
				//i가 아닌 year를 사용할 경우 1~year까지의 윤년 확인이 아닌 입력받은 year의 윤년 유무만 확인하게 된다.
				allDay++;
				//윤년인 경우 2월이 28일에서 29일이 되어 하루가 더 증가하므로 1씩 더해줌
			}
		}

		for (int j = 1; j < month; j++) {//입력한 거보다 이전 달까지의 합이 필요하므로 j < month를 사용
			if ((j == 4) || (j == 6) || (j == 9) || (j == 11)) {//30일까지 있는 월들의 합
				allDay += 30;
			} else if (j == 2) {//29일까지인 2월 찾기
				if ((((year % 4) == 0) && (year % 100) != 0) || ((year % 400) == 0)) {
					//j는 월을 의미하기 때문에 윤년을 확인하기 위해서는 입력한 year으로 비교해야한다.
					allDay += 29;
				} else {
					allDay += 28;
				}
			} else {//2, 4, 6, 9, 11 이외의 월은 31일까지
				allDay += 31;
			}
		}

		startDay = allDay % 7;//해당 월의 시작 날짜를 알아주기 위해 더해준 allDay를 7로 나누어 나머지 값을 startDay에 대입

		
		
		//월의 끝나는 날짜 구하기(28, 29, 30, 31)
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			endDay = 30;
		} else if (month == 2) {
			if ((((month % 4) == 0) && (month % 100) != 0) || ((month % 400) == 0)) {
				endDay = 29;
			} else {
				endDay = 28;
			}
		} else {
			endDay = 31;
		}
		
		
		
		
		System.out.printf("%d년\t\t\t\t\t\t%d월%n", year, month);
		System.out.printf("===============================================%n");
		System.out.printf("일\t월\t화\t수\t목\t금\t토%n");
		System.out.printf("===============================================%n");
		
		
		
		int cnt = 0;
		//7일마다 줄 바꿔주기 위해서 cnt 변수를 0으로 초기화해줌
		
		
		for(int l = 0; l <= startDay; l++) {
			if(startDay == 6)//startDay가 6이면 공백을 주지 않아도 되므로 break을 사용해서 for문을 빠져나온다.
				break;
			System.out.print("\t");
			cnt++;
		}
				for(int m = 1; m <= endDay; m++) {//1부터 endDay까지 숫자를 입력해줌
					System.out.printf("%2d", m);
					cnt++;
					if(cnt % 7 == 0) {//cnt가 7번 입력됐을 때 줄을 바꿔줌
						System.out.println();
					}
					else {
						System.out.printf("\t");//cnt가 7번 입력되지않았을 때는 간격을 넣어줌
				}
		}
	}
}