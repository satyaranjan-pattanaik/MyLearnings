package designPattern.decorator;

public abstract class ToppingDecorator implements Pizza {
	Pizza tempPizza;

	ToppingDecorator(Pizza tempPizza) {
		super();
		this.tempPizza = tempPizza;
	}

//	@Override
//	public String getDescription() {
//		return tempPizza.getDescription();
//	}
//
//	@Override
//	public Integer getCost() {
//		return tempPizza.getCost();
//	}

}
