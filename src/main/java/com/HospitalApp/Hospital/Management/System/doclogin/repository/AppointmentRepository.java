package com.HospitalApp.Hospital.Management.System.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalApp.Hospital.Management.System.doclogin.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
