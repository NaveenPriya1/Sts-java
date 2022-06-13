package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Admin;
import com.inventory.entity.Customer;
import com.inventory.entity.Item;
import com.inventory.entity.Purchase;
import com.inventory.entity.Sales;
import com.inventory.entity.Vendor;
import com.inventory.repository.AdminRepo;
import com.inventory.repository.CustomerRepo;
import com.inventory.repository.ItemRepo;
import com.inventory.repository.SaleRepo;
import com.inventory.repository.VendorRepo;
import com.inventory.repository.purchaseRepo;

@Service
public class AdminService {
	
	@Autowired
	ItemRepo itemrepo;
	
	@Autowired
	AdminRepo adminrepo;
	
	@Autowired
	CustomerRepo customerrepo;
	
	@Autowired
	VendorRepo vendorrepo;
	
	@Autowired
	purchaseRepo purchaserepo;
	
	@Autowired
	SaleRepo salerepo;
	

	public Object additem(Item item) {
		return itemrepo.save(item);
	}

	public Admin getAdminByUsername(String ausername) {
		// TODO Auto-generated method stub
		return adminrepo.findById(ausername).get();
	}


	public Item getItemById(long itemId) {
		// TODO Auto-generated method stub
		return itemrepo.findById(itemId).get();
	}

	public void deleteById(long itemId) {
		// TODO Auto-generated method stub
		 itemrepo.deleteById(itemId);
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemrepo.findAll();
	}

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepo.save(customer);
	}

	public Customer getCustomerById(long customerId) {
		// TODO Auto-generated method stub
		return customerrepo.findById(customerId).get();
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}

	public void deleteCustomerById(long customerId) {
		customerrepo.deleteById(customerId);
		
	}

	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorrepo.save(vendor);
	}

	public Vendor getVendorById(long vendorId) {
		// TODO Auto-generated method stub
		return vendorrepo.findById(vendorId).get();
	}

	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return vendorrepo.findAll();
	}

	public void deleteVendorById(long vendorId) {
		// TODO Auto-generated method stub
		vendorrepo.deleteById(vendorId);
		
	}

	public void deleteItemByVendorId(long vendorId) {
		// TODO Auto-generated method stub
		itemrepo.deleteByVendorId(vendorId);
		
	}

	public List<Purchase> getallPurchases() {
		// TODO Auto-generated method stub
		return purchaserepo.findAll();
	}

	public Purchase getPurchaseById(long purchaseId) {
		// TODO Auto-generated method stub
		return purchaserepo.findById(purchaseId).get();
	}

	public List<Purchase> findByVendorId(long vendorId) {
		// TODO Auto-generated method stub
		return purchaserepo.findByVendorId(vendorId);
	}

	public List<Sales> getallSales() {
		// TODO Auto-generated method stub
		return salerepo.findAll();
	}

	public Sales getSaleById(long saleId) {
		// TODO Auto-generated method stub
		return salerepo.findById(saleId).get();
	}
	
	}


