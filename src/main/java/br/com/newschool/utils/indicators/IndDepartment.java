package br.com.newschool.utils.indicators;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 30/12/2021
 * */

public enum IndDepartment {

	PEDAGOGY (0, "Pedagógia"), 
	ACADEMIC (1 ,"Acadêmico"),
	ADMINIDTRATIVE (2, "Administrativa"),
	FINANCIAL (3, "Financeira"),
	MANAGEMENT (4, "Gestão"),
	COMMUNICATION (5, "Comunicação"),
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
