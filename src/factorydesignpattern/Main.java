package factorydesignpattern;

public class Main {
	public static void main(String[] args) {
		ObjectInjector obj = new ObjectInjector("apollo");
		Car car = obj.getCar();
		car.getCar();
	}
}
