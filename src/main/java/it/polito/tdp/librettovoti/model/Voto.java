package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Voto {
	
	private String nomeCorso;
	private int voto; 			// 30L?
	private LocalDate data;		// Data superamento esame
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nomeCorso + " superato con " + voto + " il " + data;
	}

}
