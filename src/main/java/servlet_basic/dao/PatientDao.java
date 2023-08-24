package servlet_basic.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_basic.dto.PatientDto;

public class PatientDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(PatientDto dto)
{
	entityTransaction.begin();
	entityManager.persist(dto);
	entityTransaction.commit();
}
public String delete(int id)
{
	PatientDto dto=entityManager.find(PatientDto.class, id);
	if(dto!=null) {
	entityTransaction.begin();
	entityManager.remove(dto);
	entityTransaction.commit();
	return "data is delated";
}else
	return "data not found";
}
public PatientDto FetchById(int id)
{
	PatientDto dto=entityManager.find(PatientDto.class,id);
	return dto;
}
public List<PatientDto> fetchall()
{
	Query query=entityManager.createQuery("select ct from PatientDto ct");
	
	List<PatientDto> l1=query.getResultList();
	return l1;
	
}
public String update(int id,long number)
{
	PatientDto dto=entityManager.find(PatientDto.class,id);
	dto.setPhonenumber(number);
	entityTransaction.begin();
	entityManager.merge(dto);
	entityTransaction.commit();
	return "data is updated";
	
}
public String updateall(PatientDto dto)
{
	entityTransaction.begin();
	entityManager.merge(dto);
	entityTransaction.commit();
	
	return "data updated succesfully";
}
public String deleteall()
{
	Query query=entityManager.createQuery("select ct from PatientDto ct");
	List<PatientDto> dtos=query.getResultList();
	for(PatientDto d1:dtos)
	{
		entityTransaction.begin();
		entityManager.remove(d1);
		entityTransaction.commit();
	}
	return "data is delated";
}
}


