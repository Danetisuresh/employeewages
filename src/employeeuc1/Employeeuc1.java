package employeeuc1;
import java.util.concurrent.ThreadLocalRandom;

public class Employeeuc1 {
	public static void main(String args[]) {

		int ISFULTIME =1;
		int EmpAttend = ThreadLocalRandom.current().nextInt(0,2);
		if(EmpAttend == ISFULTIME) {
			System.out.println("employe is present");
		}
		else {
			System.out.println("employe is absent");
			
		}

	}

}
