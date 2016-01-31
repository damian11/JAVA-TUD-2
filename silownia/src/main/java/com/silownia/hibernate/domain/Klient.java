package com.silownia.hibernate.domain;
import javax.persistence.*;

@Entity
@NamedQueries({
	@NamedQuery(name = "klient.pobierzKlientow", query = "Select k from Klient k"),
	@NamedQuery(name = "klient.pobierzKlientPoImie", query = "Select k from Klient k where k.imie= :imie")
})


}
