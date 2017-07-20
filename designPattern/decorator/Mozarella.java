package designPattern.decorator;

public class Mozarella extends ToppingDecorator {

	public Mozarella(Pizza tempPizza) {
		super(tempPizza);
	}
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription() +" : Mozarella";
	}

	@Override
	public Integer getCost() {
		return tempPizza.getCost()+5;
	}
	
	

}
