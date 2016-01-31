package com.silownia.hibernate.service;
import com.silownia.hibernate.domain.Karnet;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class KarnetManager implements KarnetDAO{
	@Autowired
	private SessionFactory session;

	public SessionFactory getSessionFactory(){
		return session;
	}
	public void setSessionFactory(SessionFactory session){
		this.session = session;
	}


}
