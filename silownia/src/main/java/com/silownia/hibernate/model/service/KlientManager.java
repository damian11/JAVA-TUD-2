package com.silownia.hibernate.service;
import com.silownia.hibernate.domain.Klient;
import com.silownia.hibernate.domain.Karnet;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class KlientManager implements KlientDAO{
	@Autowired
	private SessionFactory session;


	public SessionFactory getSessionFactory(){
		return session;
	}
	public void setSessionFactory(SessionFactory session){
		this.session = session;
	}




	@SuppressWarnings("unchecked")
		@Override
		public List<Klient> pobierzKlientow() {
			return session.getCurrentSession().getNamedQuery("Klient.pobierzKlientow").list();
		}

		@Override
		public Klient pobierzKlientPoId(Klient klient) {
			return (Klient) session.getCurrentSession().get(Klient.class, klient.getId_klient());
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Klient> pobierzKlientPoImieniu(String imie) {
			return session.getCurrentSession().getNamedQuery("Klient.pobierzKlientPoImieniu").setString("imie", imie).list();
		}

		@Override
		public void dodajKlient(Klient klient) {
			klient.setId_klient(null);
			session.getCurrentSession().persist(klient);
		}

		@Override
		public void dodajKlientDoKarnetu(Klient klient, Karnet karnet) {
			Karnet ka = (Karnet) session.getCurrentSession().get(Karnet.class, karnet.getId_karnet());
			ka.getKlients().add(klient);
		}

		@Override
		public void edytujKlient(Klient klient) {
			session.getCurrentSession().update(klient);
		}

		@Override
		public void usunKlient(Klient klient) {
			session.getCurrentSession().delete(klient);
		}

}
