package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return "ring ring ringggg";
        
    }
    @Override
    public String unlock() {
		return "unlocked via face-scanner";
        
    }
    @Override
    public void displayInfo() {
    	String a = super.getVersionNumber();
    	String b = super.getCarrier();
    	Integer c = super.getBatteryPercentage();
    	System.out.println(a + " from " + b  + " has " + c + "% battery left.");          
    }
}
