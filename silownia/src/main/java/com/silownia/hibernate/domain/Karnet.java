package pl.karnet.domain;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
	@NamedQuery(name = "karnet.pobierzKarnety", query = "Select k from Karnet k")
})
	
public class Karnet {
    private Long id_karnet;
    private String rodzaj;
    private String opis;
    private double cena;

    private List<Klient> klienci = new ArrayList<Klient>();
    
	public Karnet(){}
	
	public Bilet(String rodzaj, String opis, double cena){
		this.rodzaj = rodzaj;
		this.opis = opis;
		this.cena = cena;
	}
    
   
}
