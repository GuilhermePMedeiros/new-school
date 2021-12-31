package br.com.newschool.core.utils.indicators;

public enum IndUF {
	ACRE (0, "Acre", "AC"),
	ALAGOAS (1, "Alagoas", "AL"),
	AMAZONAS (2, "Amazonas", "AM"),
	AMAPA (3, "Amap�", "AP"),
	BAHIA (4, "Bahia", "BA"),
	CEARA (5, "Cear�", "CE"),
	DISTRITO_FEDERAL (6, "Distrito Federal", "DF"),
	ESPIRITO_SANTO (7, "Esp�rito Santo", "ES"),
	GOIAS (8, "Goi�s", "GO"),
	MARANHAO (9, "Maranh�o", "MA"),
	MATO_GROSSO (10, "Mato Grosso",	"MT"),
	MATO_GROSSO_DO_SUL (11, "Mato Grosso do Sul", "MS"),
	MINAS_GERAIS (12, "Minas Gerais", "MG"),
	PARA (13, "Par�", "PA"),
	PARAIBA (14, "Para�ba", "PB"),
	PARANA (15, "Paran�", "PR"),
	PERNAMBUCO (16, "Pernambuco", "PE"),
	PIAUI (17, "Piau�", "PI"),
	RIO_DE_JANEIRO (18, "Rio de Janeiro", "RJ"),
	RIO_GRANDE_DO_NORTE (19, "Rio Grande do Norte",	"RN"),
	RIO_GRANDE_DO_SUL (20, "Rio Grande do Sul", "RS"),
	RONDONIA (21, "Rond�nia", "RO"),
	RORAIMA (22, "Roraima", "RR"),
	SANTA_CATARINA (23, "Santa Catarina", "SC"),
	SAO_PAULO (24, "S�o Paulo", "SP"),
	SERGIPE (25, "Sergipe", "SE"),
	TOCANTINS (26, "Tocantins", "TO");
	
	// Attributes
	private int indicator;
	private String description;
	private String sigla;
	
	// Gets
	public int getIndicator() {
		return indicator;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	// Build
	private IndUF(int indicator, String description, String sigla) {
		this.indicator = indicator;
		this.description = description;
		this.sigla = sigla;
	}

}
