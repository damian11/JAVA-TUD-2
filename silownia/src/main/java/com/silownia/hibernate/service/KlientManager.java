package com.silownia.hibernate.model.service;
import java.util.List;
import com.silownia.hibernate.model.domain.Klient;
import com.silownia.hibernate.model.domain.Karnet;

public interface KlientManager {
	List<Klient> pobierzKlientow();
	Klient pobierzKlientPoId(Klient klient);
	List <Klient> pobierzKlientPoKarnet(Karnet karnet);
	List<Klient> pobierzKlientPoImieniu(String imie);
	void dodajKlient(Klient klient);
	void dodajKlientaDoKarnetu(Klient klient, Karnet karnet);
	void edytujKlient(Klient klient);
	void usunKlient(Klient klient);
}
