package tests;

import robo.AbstractRobot;
import robo.BetaRobot;

public class ChargeTest {
	
	public static int SimpleChargeTest(AbstractRobot robot) {
		int percentage = 0;
		
		((BetaRobot) robot).setCharge(-100);
		if(((BetaRobot) robot).getCharge() == -100) {
			System.err.println("Charge value test failed\nREASON: the value of -100 is not allowed!");
			return percentage;
		}
		percentage += 25;
		
		((BetaRobot) robot).setCharge(1000);
		if(((BetaRobot) robot).getCharge() == 1000) {
			System.err.println("Charge value test failed\nREASON: the value of 1000 is not allowed!");
			return percentage;
		}
		percentage += 25;
		
		((BetaRobot) robot).setCharge(50);
		int i = 0;
		for(; i < 1000; i++) {
			if(!robot.moveRight()) {
				break;
			}
		}
		System.out.printf("The robot took %d steps and the charge value is %d%%\n", i, ((BetaRobot) robot).getCharge());
		percentage += 50;
		
		return percentage;
	}
}