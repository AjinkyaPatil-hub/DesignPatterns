package com.ajay.Main;

import com.ajay.abstractFactory.ComputerFactory;
import com.ajay.abstractFactory.ServerFactory;
import com.ajay.computer.Computer;

public class ComputerClient {

	public static void main(String[] args) {
		Computer pc  = ComputerFactory.createComputer(new ServerFactory("101", "54", "core"));
		System.out.println(pc);
	}

}
