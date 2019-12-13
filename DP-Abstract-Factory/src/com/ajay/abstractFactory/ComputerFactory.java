package com.ajay.abstractFactory;

import com.ajay.computer.Computer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerAbstractFactry caf){
		return caf.createComputer();
	}
}
