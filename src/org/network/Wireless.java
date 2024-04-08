package org.network;

public class Wireless {
public void modamName() {
	System.out.println("Jio");
}
public static void main (String[] args) {
	Wifi w = new Wifi();
	w.wifiName();
	
	MobileData m = new MobileData();
	m.dataName();
	
	Lan l = new Lan();
	l.lanName();
	
	Wireless n = new Wireless();
	n.modamName();
	
}
}
