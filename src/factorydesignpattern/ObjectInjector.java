package factorydesignpattern;

public class ObjectInjector {
	private String carType = "lanbo";
	private Lambhorghini lambo;
	private ApolloIE apollo;
	
	public ObjectInjector(String carType) {
		this.carType = carType;
	}
	
	public Car getCar() {
		if(carType.equals("lambo")) {
			lambo = new Lambhorghini();
			return lambo;
		}
		else {
			apollo = new ApolloIE();
			return apollo;	
		} 
	}
}
