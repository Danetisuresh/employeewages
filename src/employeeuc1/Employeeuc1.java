package employeeuc1;
import java.util.concurrent.ThreadLocalRandom;

public class Employeeuc1 {
	public static void main(String args[]) {

		int IS_FULL_TIME =1;
		int WAGE_PER_HOUR =20;
		int TOTAL_HOURS =8;
		double empCheck= (Math.floor(Math.random()*10)%2);
		  System.out.println("Employee wage is ");
		  int DAILY_WAGE = WAGE_PER_HOUR*TOTAL_HOURS;
		if (empCheck == IS_FULL_TIME) {
			System.out.println(WAGE_PER_HOUR*TOTAL_HOURS);
		}
		else {
			
			System.out.println(0);
			
			
		}

	}

}
