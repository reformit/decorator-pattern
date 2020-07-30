package solutions.reformit.blog.decoratorpattern.beverages;

import java.math.BigDecimal;

public class Coffee extends AbstractBeverage {

	@Override
	public BigDecimal cost() {
		return new BigDecimal("3.95");
	}

	@Override
	public String description() {
		return "Beverage: Coffee \n ";
	}

}
