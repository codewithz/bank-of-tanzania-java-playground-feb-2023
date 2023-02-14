package com.interfaceconcept;

public class IRunner {
	
	public static void main(String[] args) {
		IPhone iphone=new IPhone();
		Galaxy galaxy=new Galaxy();
		NokiaN3 n3=new NokiaN3();
		
		TanzainaMarket market=new TanzainaMarket();
		
		market.sell(iphone);
		market.sell(galaxy);
//		market.sell(n3);     We get this error because NokiaN3 has not implemented TBS and cannot be passed
		
		
	}

}
