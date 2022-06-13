package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Admin;
import com.inventory.entity.Customer;
import com.inventory.entity.Item;
import com.inventory.entity.Purchase;
import com.inventory.entity.Sales;
import com.inventory.entity.Vendor;
import com.inventory.services.AdminService;


@RestController
@CrossOrigin(origins= "*",allowedHeaders= "*")
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	//admin login
	public ResponseEntity<?> login(@RequestBody Admin admin){
		Admin db = adminService.getAdminByUsername(admin.getAusername());
		if(db.getApassword().equals(admin.getApassword()))
			return ResponseEntity.ok(db);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	//Items Related 
	//To add item
	@PostMapping("/item")
	public ResponseEntity<?> addItem(@RequestBody Item item) {
		return ResponseEntity.ok(adminService.additem(item));
	}
	
	//to get item by id
	@GetMapping("/item/{itemId}")
	public ResponseEntity<?> getItemById(@PathVariable("itemId") long itemId){
		Item item = adminService.getItemById(itemId);
		if(item != null) 
			return ResponseEntity.ok(item);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//to delete item by id
	@DeleteMapping("/item/{itemId}")
	public void deleteItemById(@PathVariable("itemId") long itemId){
		 adminService.deleteById(itemId);
		
	}
	
	//to get all items
	@GetMapping("/item")
	public ResponseEntity<?> getAllItems(){
		List<Item> itemList = adminService.getAllItems();
		if(itemList.size() != 0)
			return ResponseEntity.ok(itemList);
					return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	//customer related section
	
	//to add customer
	@PostMapping("/customer")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		return ResponseEntity.ok(adminService.addCustomer(customer));
		
	}
	
	//  to get customer by id
	@GetMapping("/custmer/{customerId}")
	public ResponseEntity<?> getCustomerById(@PathVariable("customerId") long customerId){
		Customer customer = adminService.getCustomerById(customerId);
				if(customer != null)
					return ResponseEntity.ok(customer);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	@GetMapping("/customer")
	public ResponseEntity<?> getAllCustomers(){
		List<Customer> cusList = adminService.getAllCustomers();
		if(cusList.size()!= 0)
			return ResponseEntity.ok(cusList);
		return(ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	// to delete customer by id
	@DeleteMapping("/custmer/{customerId}")
	public void deleteCustomerById(@PathVariable("customerId") long customerId) {
		adminService.deleteCustomerById(customerId);
	}
	
	// vendor section
	
	// to add vendor
	@PostMapping("/vendor")
	public ResponseEntity<?> addVendor(@RequestBody Vendor vendor){
		return ResponseEntity.ok(adminService.addVendor(vendor));
		
	}
	
	//to search vendor by id
	@GetMapping("/vendor/{vendorId}")
	public ResponseEntity<?> getVendorbyId(@PathVariable("vendorId") long vendorId){
		Vendor vendor = adminService.getVendorById(vendorId);
				if(vendor != null)
					return ResponseEntity.ok(vendor);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	//to get all vendors 
	@GetMapping("/vendor")
	public ResponseEntity<?> getAllVendors(){
		List<Vendor> venList = adminService.getAllVendors();
		if(venList.size() != 0)
			return ResponseEntity.ok(venList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//delete vendor by id
	@DeleteMapping("/vendor/{vendorId}")
	public void deleteVendorById(@PathVariable("vendorId") long vendorId) {
		adminService.deleteVendorById(vendorId);
	}
	
	//to delete item By vendor id
	@DeleteMapping("/vendor/item/{vendorId}")
	public void deleteItemByVendorId(@PathVariable("vendorId") long vendorId) {
		adminService.deleteItemByVendorId(vendorId);
	}
	
	//purchases section
	
	@GetMapping("/purchases")
	public ResponseEntity<?> getAllPurchases(){
		List<Purchase> purList = adminService.getallPurchases();
		if(purList.size()!= 0)
			return ResponseEntity.ok(purList) ;
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	@GetMapping("/purchases/{purchaseId}")
	public ResponseEntity<?> getPurchaseById(@PathVariable("purchaseId") long purchaseId){
		Purchase purchase = adminService.getPurchaseById(purchaseId);
				if(purchase != null)
					return ResponseEntity.ok(purchase);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	@GetMapping("/purchases/{vendorId}")
	public ResponseEntity<?> getPurchaseByVendorId(@PathVariable("vendorId") long vendorId){
		List<Purchase> pList= adminService.findByVendorId(vendorId);
		  if(pList.size()>0)
			  return ResponseEntity.ok(pList);
		  return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//Sales section
	//get all sales
	@PostMapping("/sale")
	public ResponseEntity<?> getAllSales(){
		List<Sales> saleList = adminService.getallSales();
		if(saleList.size()>0)
			return ResponseEntity.ok(saleList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
				
	}
	
	//to get sale by id
	@PostMapping("/sale/{saleid}")
	public ResponseEntity<?> getSaleById(@PathVariable("saleId") long saleId){
		Sales sales = adminService.getSaleById(saleId);
		if(sales != null)
			 return ResponseEntity.ok(sales);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	
	}



