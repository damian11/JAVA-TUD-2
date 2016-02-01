package com.silownia.hibernate.model.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
	@NamedQuery(name = "Karnet.pobierzKarnety", query = "Select ka from Karnet ka")
})

public class Karnet {
    private Long id_karnet;
    private String rodzaj;
    private String opis;
;

    private List<Klient> klienci = new ArrayList<Klient>();

	public Karnet(){}

	public Karnet(String rodzaj, String opis){
		this.rodzaj = rodzaj;
		this.opis = opis;
		
	}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId_karnet(){
        return id_karnet;
    }
    public void setId_karnet(Long id_karnet){
        this.id_karnet = id_karnet;
    }

    public String getOpis(){
        return opis;
    }
    public void setOpis(String opis){
        this.opis = opis;
    }

    public String getRodzaj(){
        return rodzaj;
    }
    public void setRodzaj(String rodzaj){
        this.rodzaj = rodzaj;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Klient> getKlients(){
        return klienci;
    }
    public void setKlients(List<Klient> klienci){
        this.klienci = klienci;
    }
}
