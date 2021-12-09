package br.com.newschool.core.utils.indicators;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

public enum IndSex {
	
	// Values
	MALE (0, "Masculino", 'm' ), FEMALE(1, "feminino", 'f');
	
	// Attributes 
	private int indicator;
	private String description;
	private char fistLetter;
	
	// Build
	IndSex(int indicator, String description, char fistLetter){
		this.indicator = indicator;
		this.description = description;
		this.fistLetter = fistLetter;
	}
	
}
