package solutions.reformit.blog.decoratorpattern;

import solutions.reformit.blog.decoratorpattern.beverages.*;
import solutions.reformit.blog.decoratorpattern.decorators.*;

public class Order {

	public static void main(String[] args) {
		AbstractBeverage coffee = new CaramelDecorator(new ExtraShotsDecorator(new SizeDecorator(new Coffee(), SizeEnum.SMALL), 2));
		System.out.println(coffee.description() + "\n PRICE = $"+coffee.cost());
		
		System.out.println();
		
		AbstractBeverage tea = new SizeDecorator(new Tea(), SizeEnum.LARGE);
		System.out.println(tea.description() + "\n PRICE = $"+tea.cost());
	}

}
