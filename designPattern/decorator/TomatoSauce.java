package designPattern.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza tempPizza) {
		super(tempPizza);
	}

	
	@Override
	public String getDescription() {
		return tempPizza.getDescription() +" : Tomato ";
	}

	@Override
	public Integer getCost() {
		return tempPizza.getCost()+15;
	}
	
}
