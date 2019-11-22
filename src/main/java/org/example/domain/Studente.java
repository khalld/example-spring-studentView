package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Studente {
	
	private String matricola;
	private String nome;
	private String cognome;
	private String istituto;
	private int eta;
	
	public Studente() {
		super();
	}

	public Studente(String matricola, String nome, String cognome, String istituto, int eta) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.istituto = istituto;
		this.eta = eta;
	}
	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getIstituto() {
		return istituto;
	}
	public void setIstituto(String istituto) {
		this.istituto = istituto;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	

}
