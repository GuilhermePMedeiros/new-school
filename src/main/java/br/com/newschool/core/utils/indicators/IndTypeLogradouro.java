package br.com.newschool.core.utils.indicators;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 29/12/2021
 * */

public enum IndTypeLogradouro {
	
	AEROPORTO (0, "Aeroporto"),
	ALAMEDA (1, "Alameda"),
	AREA (2, "�rea"),
	AVENIDA (3, "Avenida"),
	CAMPO (4, "Campo"),
	CHACARA (5, "Ch�cara"),
	COLONIA (6, "Col�nia"),
	CONDOMINIO (7, "Condom�nio"),
	CONJUNTO (8, "Conjunto"),
	DISTRITO (9, "Distrito"),
	ESPLANADA (10, "Esplanada"),
	ESTACAO (11, "Esta��o"),
	ESTRADA (12, "Estrada"),
	FAVELA (13, "Favela"),
	FAZENDA (14, "Fazenda"),
	FEIRA (15, "Feira"),
	JARDIM (16, "Jardim"),
	LADEIRA (17, "Ladeira"),
	LAGO (18, "Lago"),
	LAGOA (19, "Lagoa"),
	LARGO (20,"Largo"),
	LOTEAMENTO (21, "Loteamento"),
	MORRO (22, "Morro"),
	NUCLEO (23, "N�cleo"),
	PARQUE (24, "Parque"),
	PASSARELA (25, "Passarela"),
	PATIO (26, "P�tio"),
	PRACA (27, "Pra�a"),
	QUADRA (28, "Quadra"),
	RECANTO (29, "Recanto"),
	RESIDENCIAL (30, "Residencial"),
	RODOVIA (31, "Rodovia"),
	RUA (32, "Rua"),
	SETOR (33, "Setor"),
	SITIO (34, "S�tio"),
	TRAVESSA (35, "Travessa"),
	TRECHO (36, "Trecho"),
	TREVO (37, "Trevo"),
	VALE (38, "Vale"),
	VEREDA (39, "Vereda"),
	VIA (40, "Via"),
	VIADUTO (41, "Viaduto"),
	VIELA (42, "Viela"),
	VILA (43, "Vila");

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
	private IndTypeLogradouro(int indicator, String description) {
		this.indicator = indicator;
		this.description = description;
	}

}
