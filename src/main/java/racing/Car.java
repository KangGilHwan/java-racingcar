package racing;

import java.util.Random;
import java.util.Scanner;

public class Car {
  
  public void run(int car, int num) {//차 각각의 주행 거리 출력
	  
	  Random ran = new Random();
	  
    for(int i = 0; i < car; i++) {
     test(ran, num);
    }
  }
  
  void test(Random ran, int num) {//차 하나의 주행 거리
	  
		for(int j = 0; j < num; j++) {
    		ran(ran);
    	}
    	System.out.println("");
    
  }
  
    public void ran(Random ran) {//랜덤 수 만들고 확인하는 메소드
    
   	 int rd_num = ran.nextInt(9);
   	 
   	 if(rd_num >= 4) {
		System.out.print("-");// TODO 구현
	}
  }
  
  
  public static void main(String args[]) {
	  Scanner nn = new Scanner(System.in);
	  Car race = new Car();
	  
	  System.out.println("자동차 대수는 몇 대 인가요?");
	  int car = nn.nextInt();
	  
	  System.out.println("시도할 횟수는 몇 회 인가요?");
	  int num = nn.nextInt();
	  
	  race.run(car, num);
	  
  }
}