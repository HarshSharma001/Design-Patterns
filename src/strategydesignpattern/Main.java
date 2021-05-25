package strategydesignpattern;

public class Main {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		PrintArray array = new RunTimeStrategyChooser().setStrategy("");
		array.printArray(arr);
	}
}
