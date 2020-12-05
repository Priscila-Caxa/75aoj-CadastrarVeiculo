package com.example.demo.domain;

public enum TipoVeiculo {
    
    VUC(1, "VEICULO URBANCO DE CARGA"), 
	VAN(2, "VAN");
	
	private int cod;
	private String descricao;
	
	private TipoVeiculo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCod() {
		return cod;
	}
	
	
	public static TipoVeiculo toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
			
		for(TipoVeiculo x : TipoVeiculo.values()) {
			if(cod.equals(cod)) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
