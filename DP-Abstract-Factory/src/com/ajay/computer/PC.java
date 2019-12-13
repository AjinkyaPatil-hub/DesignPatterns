package com.ajay.computer;

public class PC implements Computer{
	private String HDD;
	private String RAM;
	private String CPU;

	public PC(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
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

	@Override
	public String toString() {
		return "PC [HDD=" + HDD + ", RAM=" + RAM + ", CPU=" + CPU + "]";
	}
}
