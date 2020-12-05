package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Veiculo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private String modelo;
	private String placa;
	private String tipoVeiculo;
	private String capacidadeCarga;

	public Integer getId() {
		return id;
	}

	public Veiculo(Integer id, String marca, String modelo, String placa, String tipoVeiculo, String capacidadeCarga, String dimensoes, Date dataInclusao, Date dataUltAlteracao) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.tipoVeiculo = tipoVeiculo;
		this.capacidadeCarga = capacidadeCarga;
		this.dimensoes = dimensoes;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
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

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(String capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	public void setDataUltAlteracao(Date dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}

	private String dimensoes;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataInclusao;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Veiculo veiculo = (Veiculo) o;
		return id.equals(veiculo.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataUltAlteracao;

	public Veiculo() {
	}
}
