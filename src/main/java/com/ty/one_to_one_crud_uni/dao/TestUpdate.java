package com.ty.one_to_one_crud_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one_crud_uni.dto.Invoice;
import com.ty.one_to_one_crud_uni.dto.Item;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		Invoice invoice = entityManager.find(Invoice.class, 14);
		Item item = invoice.getItem();

		item.setItem_id(3);
		item.setItem_name("yoga");
		item.setItem_price(600);
		item.setQuantity(2);

		invoice.setId(14);
		invoice.setName("mat");
		invoice.setBillingAddress("4th block");
		invoice.setGstNumber("gh-675-8758");
		invoice.setTax(24);
		invoice.setItem(item);

		entityManager.merge(invoice);

		entityTransaction.commit();

		System.out.println("Data Updated");

	}
}
