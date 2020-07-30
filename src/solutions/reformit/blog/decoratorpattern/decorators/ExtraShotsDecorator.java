package solutions.reformit.blog.decoratorpattern.decorators;

import java.math.BigDecimal;

import solutions.reformit.blog.decoratorpattern.beverages.AbstractBeverage;

public class ExtraShotsDecorator extends AbstractOptionsDecorator {

	private AbstractBeverage beverage;
	private Integer extraShots;
	
	public ExtraShotsDecorator(AbstractBeverage aBeverage, Integer extraShotsCount) {
		this.beverage = aBeverage;
		this.extraShots = extraShotsCount;
	}
	
	@Override
	public BigDecimal cost() {
		return this.beverage.cost().add(new BigDecimal(extraShots).multiply(new BigDecimal("0.85")));
	}

	@Override
	public String description() {
		return this.beverage.description() + this.extraShots + " Shots ";
	}

}
