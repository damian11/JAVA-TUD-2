package com.silownia.hibernate.service;
import com.silownia.hibernate.domain.Karnet;
import com.silownia.hibernate.domain.Klient;
import java.util.List;

public interface KlientDAO{
	
	
	List<Klient> pobierzKlientow();
	
	Klient pobierzKlientPoId(Klient klient);
	
	List<Klient> pobierzKlientaPoImieniu(String imie);
	
	void dodajKlient(Klient klient);
	void edytujKlient(Klient klient);
	void usunKlient(Klient klient);
	void dodajKlientDoKarnetu(Klient klient, Karnet karnet);
}
