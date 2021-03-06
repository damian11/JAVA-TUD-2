package com.silownia.hibernate.model.domain;
import javax.persistence.*;

@Entity
@NamedQueries({
	@NamedQuery(name = "Klient.pobierzKlientow", query = "Select k from Klient k"),
	@NamedQuery(name = "Klient.pobierzKlientPoImie", query = "Select k from Klient k where k.imie= :imie")
})

public class Przedstawienie implements java.io.Serializable{
private static final long serialVersionUID = 1L;

    private Long id_klient;
    private String imie;
    private String nazwisko;

	public Klient(){}

	public Klient(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	}





    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId_klient() {
        return id_klient;
    }
    public void setId_klient(Long id_klient) {
        this.id_klient = id_klient;
    }


@Column(nullable = false)
public String getImie() {
	return imie;

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
