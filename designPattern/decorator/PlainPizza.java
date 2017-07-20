package designPattern.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin Daugh";
	}

	@Override
	public Integer getCost() {
		return 10;
	}

}
