package com.ty.one_to_one_crud_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one_crud_uni.dto.Invoice;
import com.ty.one_to_one_crud_uni.dto.Item;

public class TestBy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Item item = new Item();
		item.setItem_id(5);
		item.setItem_name("ball");
		item.setItem_price(100);
		item.setQuantity(4);

		Invoice invoice = new Invoice();
		invoice.setId(15);
		invoice.setBillingAddress("btm");
		invoice.setGstNumber("pnb-46675-7578");
		invoice.setTax(18.3);
		invoice.setName("book invoice");
		invoice.setItem(item);

		entityTransaction.begin();
		entityManager.persist(invoice);
		entityTransaction.commit();
	}

}
