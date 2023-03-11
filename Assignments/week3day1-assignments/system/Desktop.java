package org.system;

public class Desktop extends Computer {
	public void destopSize() {
		System.out.println(" It is 16:9 in size");
	}
		

	public static void main(String[] args) {
		Desktop make = new Desktop();
		make.compModel();
		make.destopSize();
	}

}
