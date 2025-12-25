package com.HospitalApp.Hospital.Management.System.doclogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalApp.Hospital.Management.System.doclogin.entity.Appointment;
import com.HospitalApp.Hospital.Management.System.doclogin.repository.AppointmentRepository;

@RestController
@RequestMapping("api/v2")
public class AppointmentController {

	private AppointmentRepository appointmentRepository;

	public AppointmentController(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}
	
	@PostMapping("insert")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		
		return appointmentRepository.save(appointment);
	}
	
	@GetMapping
	public List<Appointment> getAllAppointments(){
		
		return appointmentRepository.findAll();
	}
}
