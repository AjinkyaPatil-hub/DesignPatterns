package com.ajay.computer;

public class Server implements Computer {

	private String HDD;
	private String RAM;
	private String CPU;

	public Server(String hDD, String rAM, String cPU) {
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public String toString() {
		return "Server [HDD=" + HDD + ", RAM=" + RAM + ", CPU=" + CPU + "]";
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

}
