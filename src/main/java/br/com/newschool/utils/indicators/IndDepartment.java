package br.com.newschool.utils.indicators;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 30/12/2021
 * */

public enum IndDepartment {

	PEDAGOGY (0, "Pedag�gia"), 
	ACADEMIC (1 ,"Acad�mico"),
	ADMINIDTRATIVE (2, "Administrativa"),
	FINANCIAL (3, "Financeira"),
	MANAGEMENT (4, "Gest�o"),
	COMMUNICATION (5, "Comunica��o"),
	EDUCATIONAL (6 ,"Educacional");

	// Attributes
	private int indicator;
	private String description;

	// Gets
	public int getIndicator() {
		return indicator;
	}

	public String getDescription() {
		return description;
	}

	// Build
	private IndDepartment(int indicator, String description) {
		this.indicator = indicator;
		this.description = description;
	}

}
