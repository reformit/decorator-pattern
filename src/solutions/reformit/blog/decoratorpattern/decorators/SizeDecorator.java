package solutions.reformit.blog.decoratorpattern.decorators;

import java.math.BigDecimal;

import solutions.reformit.blog.decoratorpattern.beverages.AbstractBeverage;

public class SizeDecorator extends AbstractOptionsDecorator {
	
	private AbstractBeverage beverage;
	private SizeEnum size;
	
	public SizeDecorator(AbstractBeverage aBeverage, SizeEnum aSize) {
		this.beverage = aBeverage;
		this.size = aSize;
	}
	@Override
	public BigDecimal cost() {
		String cost = "0.00";
		
		switch (this.size) {
		case SMALL:
			cost = "1.00";
			break;
			
		case MEDIUM:
			cost = "2.00";
			break;
			
		case LARGE:
			cost = "3.00";
			break;			

		default:
			//Do Nothing
			break;
		}
		
		return this.beverage.cost().add(new BigDecimal(cost));
	}
	@Override
	public String description() {
		return this.beverage.description() + this.size.name() + " ";
	}

}
