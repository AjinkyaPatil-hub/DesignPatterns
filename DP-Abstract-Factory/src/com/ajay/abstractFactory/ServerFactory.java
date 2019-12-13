package com.ajay.abstractFactory;

import com.ajay.computer.Computer;
import com.ajay.computer.Server;

public class ServerFactory implements ComputerAbstractFactry {

	private String RAM;
	private String HDD;
	private String CPU;
	

	public ServerFactory(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new Server(this.RAM, this.HDD, this.CPU);
	}

}
