package org.example.service;

import java.util.List;

import org.example.domain.Studente;

public interface StudenteService {
	
	public Studente addStudent(Studente s);
	public List<Studente> getAllStudents();
	public Studente searchByMatr(String matricola);
	public Studente update(Studente s);

}
