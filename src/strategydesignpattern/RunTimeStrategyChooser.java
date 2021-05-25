package strategydesignpattern;

public class RunTimeStrategyChooser {
	public PrintArray setStrategy(String type) {
		if (type.equals("iterative")) {
			return new PrintArrayIteratively();
		} else
			return new PrintArrayRecursively();
	}
}
