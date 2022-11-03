package com.radek.andersonhelder.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notas {

	@Id
	private Integer nota;

	private int valorMin;

	private int valorMax;

	public Notas() {
	}

	public Notas(int nota, int valorMin, int valorMax) {
		super();
		this.nota = nota;
		this.valorMin = valorMin;
		this.valorMax = valorMax;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getValorMin() {
		return valorMin;
	}

	public void setValorMin(int valorMin) {
		this.valorMin = valorMin;
	}

	public int getValorMax() {
		return valorMax;
	}

	public void setValorMax(int valorMax) {
		this.valorMax = valorMax;
	}

}
