package strategydesignpattern;

public class PrintArrayRecursively extends PrintArray{

	@Override
	public void printArray(int[] arr) {
		print(arr, arr.length-1);
	}
	
	private void print(int[] arr, int n) {
		//Base Case
		if(n < 0) {
			return;
		}
		print(arr, n-1);
		System.out.print(arr[n]+" ");
	}
}
