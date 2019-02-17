package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return "ringgggggg ringggggg";
        
    	
    }
    @Override
    public String unlock() {
		return "unlocking via fingerprint scanner";
        
    }
    @Override
    public void displayInfo() {
        // your code here
    	String a = super.getVersionNumber();
    	String b = super.getCarrier();
    	Integer c = super.getBatteryPercentage();
    	System.out.println(a + " from " + b  + " has " + c + "% battery left.");
    }
}
