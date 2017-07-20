package designPattern.decorator;

public class TestDecorate {

	public static void main(String[] args) {

		Pizza pizza = new TomatoSauce(new Mozarella(new PlainPizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());

	}

}
