package com.ty.one_to_one_crud_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one_crud_uni.dto.Invoice;



public class TestDelBy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		Invoice invoice = entityManager.find(Invoice.class, 15);

		if (invoice != null) {
			entityManager.remove(invoice);
			System.out.println("Data deleted");
		} else {
			System.out.println("No Data to Delete");
		}
		
		entityTransaction.commit();

	}
}
