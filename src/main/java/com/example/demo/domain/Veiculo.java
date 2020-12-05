package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistenc.Entity;
import javax.persistenc.GeneratedValue;
import javax.persistenc.GenerationType;
import javax.persistenc.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Veiculo implements Serializable{
	private static final long serialVersionUID = 1L;
	private final Object capacidadeCarga;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private String modelo;
	private String placa;
	private String tipoVeiculo;
	private String CapacidadeCarga;
	private String Dimensoes;



	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCapacidadeCarga() {
		return capacidadecarga;
	}

	public void setCapacidadeCarga(String capacidadeCarga) {
		this.capcidadeCarga = capacidadeCarga;
	}

	public String getDimensoes() {
		return Dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.Dimensoes = dimensoes;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}



	private Integer id;
	private String marca;
	private String modelo;
	private String placa;
	private String tipoVeiculo;
	private String CapacidadeCarga;
	private Integer Dimensoes;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private final ThreadLocal<Date> dataInclusao = new ThreadLocal<Date>();

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataUltAlteracao;


	public Date getDataInclusao() {
		return dataInclusao.get();
	}


	public Date getDataUltAlteracao() {
		return dataUltAlteracao;
	}


	public void setDataInclusao(Date dataInclusao) {
    	this.dataInclusao.set(dataInclusao);
	}


	public void setDataUltAlteracao(Date dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}



	public Integer getId() {
		return id;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public Integer getCapacidadeCarga() {
		return capacidadeCarga();
	}


	public Integer getDimensoes() {
		return Dimensoes;
	}

	public Tipo Veiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) { this.modelo = modelo; }

	public void setPlaca(String placa) { this.placa = placa; }

	public void setTipoVeiculo(String tipoVeiculo) { this.tipoVeiculo = tipoVeiculo; }

	public void setCapacidadeCarga(Integer capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }

	public void setDimensoes(Integer dimensoes) {
		this.Dimensoes = dimensoes;
	}



	public Veiculo(Integer id, String marca, String modelo, String placa, String tipoVeiculo, String CapacidadeCarga, Integer Dimensoes,
				   String dimensoes, Date dataInclusao, Date dataUltAlteracao) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.tipoVeiculo = tipoVeiculo;
		this.Dimensoes = dimensoes;
		this.capacidadeCarga = capacidadeCarga;
		this.Dimensoes = dimensoes;
		this.dataInclusao.set(dataInclusao);
		this.dataUltAlteracao = dataUltAlteracao;

	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}


	public Veiculo() {
		super();
	}
}
