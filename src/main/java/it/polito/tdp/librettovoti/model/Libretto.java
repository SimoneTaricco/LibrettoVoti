package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti; // "partire con la classe generica"
	
	public Libretto() {
		this.voti = new ArrayList<>(); // assegnazione di una variabile	
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	/*
	public void stampaVotiUguali(int punteggio) {
		
	}
	
	public String votiUguali(int punteggio) {
		
	}
	*/
	public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto> risultato = new ArrayList<>();
		for(Voto v:this.voti) {
			if (v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	public String toString() {
		String s = "";
		for(Voto v:this.voti) {
			s = s + v.toString() + "\n";
		}
		return s.trim();
	}
	

}
