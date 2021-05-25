package strategydesignpattern;

public class PrintArrayIteratively extends PrintArray{
	
	public void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
