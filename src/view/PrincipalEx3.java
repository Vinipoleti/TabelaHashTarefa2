package view;

import Controller.EspalhamentoEx3;

public class PrincipalEx3 {

	public static void main(String[] args) {
		
		EspalhamentoEx3 eCont = new EspalhamentoEx3();
		
		try {
			eCont.op();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}