package com.silownia.hibernate.model.service;
import java.util.List;
import com.silownia.hibernate.model.domain.Karnet;

public interface KarnetManager {
	List<Karnet> pobierzKarnety();
	Karnet pobierzKarnetPoId(Karnet karnet);
	void dodajKarnet(Karnet karnet);
	void edytujKarnet(Karnet karnet);
	void usunKarnet(Karnet karnet);
}
