package solutions.reformit.blog.decoratorpattern.beverages;

import java.math.BigDecimal;

public class Tea extends AbstractBeverage {

	@Override
	public BigDecimal cost() {
		return new BigDecimal("2.95");
	}

	@Override
	public String description() {
		return "Beverage: Tea\n ";
	}

}
