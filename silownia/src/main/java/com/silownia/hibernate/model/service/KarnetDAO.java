package com.silownia.hibernate.service;
import com.silownia.hibernate.domain.Karnet;
import java.util.List;

public interface KarnetDAO{
	List<Karnet> pobierzKarnety();
	Bilet pobierzKarnetyPoId(Karnet karnet);
	void dodajKarnet(Karnet karnet);
	void edytujKarnet(Karnet karnet);
	void usunKarnet(Karnet karnet);
}
