package com.interfaceconcept;

public class Galaxy extends Phone implements CE,TBS{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call of Samsung Galaxy");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("SMS of Samsung Galaxy");
	}

	@Override
	public void processX() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy-CE-pX");
	}

	@Override
	public void processY() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy-CE-pY");
	}

	@Override
	public void processA() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy-TBS-pA");
	}

	@Override
	public void processB() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy-TBS-pB");
	}

	
	
	

}
