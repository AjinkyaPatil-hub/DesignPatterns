package com.ajay.abstractFactory;

import com.ajay.computer.Computer;
import com.ajay.computer.PC;

public class PCFactory implements ComputerAbstractFactry{

	private String RAM;
	private String HDD;
	private String CPU;
	
	
	public PCFactory(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		
		return new PC(this.RAM, this.HDD, this.CPU);
		
	}

}
