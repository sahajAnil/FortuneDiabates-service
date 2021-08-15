package com.fortune;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppointmentRestController {

	@Autowired
	private AppointmentRepository repository;
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/addAppointment")
	public String saveAppointment(@RequestBody Appointment appointment) {
		repository.save(appointment);
		return "Added Appointment with id : " + appointment.getId();
	}

	@CrossOrigin("http://localhost:4200")
	@GetMapping("/findAllAppointments")
	public List<Appointment> getAppointment() {
		return repository.findAll();
	}

//	@GetMapping("/findAllBooks/{id}")
//	public Optional<Book> getBook(@PathVariable int id) {
//		return repository.findById(id);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String deleteBook(@PathVariable int id) {
//		repository.deleteById(id);
//		return "book deleted with id : " + id;
//	}

}
