package com.example.springJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
	StudentDAO dao;
@PostMapping("insert")
public Student insert(@RequestBody Student s) {
	return dao.insert(s);
}

@PostMapping("insertall")
public List<Student> insertall(@RequestBody List<Student> s){
	return dao.insertall(s);
}

@GetMapping("getall")
public List<Student> getall(){
return dao.getall();
}

@GetMapping("getbyid/{id}")
public Student getByid(@PathVariable int id) {
	return dao.getByid(id);
}

@DeleteMapping("deletebyid/{id}")
public String deleteByid(@PathVariable int id) {
return dao.deleteByid(id);
}

@PutMapping("update")
public Student update(@RequestBody Student s) {
return dao.update(s);	
}


}
