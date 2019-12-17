package robo;

public class CharlieRobot extends BetaRobot {
	
	public CharlieRobot(String name, String model) {
		super(name, model);
	}
	
	public boolean moveDownRight() {
		if(getCharge() > 5 && ((AlphaRobot) this).moveRight() && ((AlphaRobot) this).moveDown()) {
			setSteps(getSteps() + 1);
			if(getSteps() % 2 == 0) {
				setCharge(getCharge() - 1);
			}
			return true;
		}
		return false;
	}
	public boolean moveDownLeft() {
		if(getCharge() > 5 && ((AlphaRobot) this).moveLeft() && ((AlphaRobot) this).moveDown()) {
			setSteps(getSteps() + 1);
			if(getSteps() % 2 == 0) {
				setCharge(getCharge() - 1);
			}
			return true;
		}
		return false;
	}
	public boolean moveUpRight() {
		if(getCharge() > 5 && ((AlphaRobot) this).moveRight() && ((AlphaRobot) this).moveUp()) {
			setSteps(getSteps() + 1);
			if(getSteps() % 2 == 0) {
				setCharge(getCharge() - 1);
			}
			return true;
		}
		return false;
	}
	public boolean moveUpLeft() {
		if(getCharge() > 5 && ((AlphaRobot) this).moveLeft() && ((AlphaRobot) this).moveUp()) {
			setSteps(getSteps() + 1);
			if(getSteps() % 2 == 0) {
				setCharge(getCharge() - 1);
			}
			return true;
		}
		return false;
	}
}