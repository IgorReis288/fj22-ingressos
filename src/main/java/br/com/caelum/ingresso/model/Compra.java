package br.com.caelum.ingresso.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Ingresso> ingressos = new ArrayList<>();
	
	/**
	 * @deprecated hibernate only
	 */
	public Compra() {
		
	}
	
	public Compra(List<Ingresso> ingresso) {
		this.ingressos = ingressos;
	}
	
}
