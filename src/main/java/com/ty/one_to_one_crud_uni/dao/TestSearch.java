package com.ty.one_to_one_crud_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one_crud_uni.dto.Invoice;
import com.ty.one_to_one_crud_uni.dto.Item;

public class TestSearch {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Invoice invoice = entityManager.find(Invoice.class, 2);
		System.out.println("ID is :" + invoice.getId());
		System.out.println("Name is :" + invoice.getBillingAddress());
		System.out.println("Price is :" + invoice.getName());

		Item item = invoice.getItem();
		System.out.println("Id is :" + item.getItem_id());
		System.out.println("name is :" + item.getItem_name());
		System.out.println("price is :" + item.getItem_price());

	}
}