package br.com.newschool.utils.indicators;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

public enum IndDayShifts {
	
	// Values
	MORNING (0, "morning"), AFTERNOON (1, "afternoon"), NIGTH (2, "nigth"), FULL (3, "full-shifts");
	
	// Attributes
	private int indicator;
	private String description;
	
	// Build
	private IndDayShifts(int indicator, String description) {
		this.indicator = indicator;
		this.description = description;
	}
	
}
