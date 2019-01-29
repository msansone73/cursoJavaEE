package br.com.msansone.hellotodo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao {

	@PersistenceContext(name="oraclexe")
	EntityManager entityManager;


}
