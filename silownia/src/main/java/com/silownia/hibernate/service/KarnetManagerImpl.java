package com.silownia.hibernate.model.service;
import com.silownia.hibernate.domain.Karnet;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.silownia.hibernate.model.domain.Karnet;

@Transactional
public class KarnetManagerImpl implements KarnetManager{
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
  	public List<Karnet> pobierzKarnety(){
  		return session.getCurrentSession().getNamedQuery("Karnet.pobierzKarnety").list();
  	}

  	@Override
  	public Karnet pobierzKarnetPoId(Karnet karnet){
  		return (Karnet) session.getCurrentSession().get(Karnet.class, karnet.getId_karnet());
  	}

  	@Override
  	public void dodajKarnet(Karnet karnet){
  		karnet.setId_karnet(null);
  		session.getCurrentSession().persist(karnet);
  	}

  	@Override
  	public void edytujKarnet(Karnet karnet){
  		session.getCurrentSession().update(karnet);
  	}

  	@Override
  	public void usunKarnet(Karnet karnet){
  		session.getCurrentSession().delete(karnet);
  	}

}
