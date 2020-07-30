package solutions.reformit.blog.decoratorpattern.decorators;

import java.math.BigDecimal;

import solutions.reformit.blog.decoratorpattern.beverages.AbstractBeverage;

public class CaramelDecorator extends AbstractOptionsDecorator {

	AbstractBeverage beverage;
	
	public CaramelDecorator(AbstractBeverage aBeverage) {
		this.beverage = aBeverage;
	}
	
	@Override
	public BigDecimal cost() {
		return this.beverage.cost().add(new BigDecimal("1.15"));
	}

	@Override
	public String description() {
		return this.beverage.description() + "Caramel ";
	}

}
