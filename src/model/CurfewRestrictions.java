package model;

public class CurfewRestrictions {
	
	private int age;
	
	public CurfewRestrictions() {
		age = 0;
	}
	
	public int getAge() {
		return age;
	}

	public String canIGoOutside( int age ) {
		String message;
		if( age < 22 )
			message = "Debe quedarse en la casa. Su corta edad lo pone en mayor riesgo.";
		else if( age >= 22 && age < 60 )
			message = "Puede salir, aunque le recomendamos que se cuide mucho.";
		else if( age >= 60 )
			message = "No puede salir. Usted pertenece a un sector poblacional vulnerable.";
		else
			message = "Enter a valid option";
		return message;
	}

}
