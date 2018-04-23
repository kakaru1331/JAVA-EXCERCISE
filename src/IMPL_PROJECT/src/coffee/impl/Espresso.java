package coffee.impl;

import coffee.ext.Drip;
import coffee.itfc.Coffee;

public class Espresso extends Drip implements Coffee {
	
	private String name = "Espresso";

	@Override
	public String checkCoffeOrigin() {
		return name + "-������:��Ʈ��";
	}
	
	@Override
	public String dripBrew() {
		return super.drip(name);
	}
}
