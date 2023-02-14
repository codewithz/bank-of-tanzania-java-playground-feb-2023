package com.interfaceconcept;

public class IPhone extends Phone implements CE,TBS{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call of Apple IPhone");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("SMS of Apple IPhone");
	}
	
	@Override
	public void processX() {
		// TODO Auto-generated method stub
		System.out.println("IPhone-CE-pX");
	}

	@Override
	public void processY() {
		// TODO Auto-generated method stub
		System.out.println("IPhone-CE-pY");
	}

	@Override
	public void processA() {
		// TODO Auto-generated method stub
		System.out.println("IPhone-TBS-pA");
	}

	@Override
	public void processB() {
		// TODO Auto-generated method stub
		System.out.println("IPhone-TBS-pB");
	}
	
	
	

}
