package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.domain.Studente;
import org.springframework.stereotype.Service;

@Service
public class StudenteServiceImpl implements StudenteService {
	
	private List<Studente> lista;

	public StudenteServiceImpl() {
		lista  = new ArrayList<Studente>();
		
		Studente s = new Studente("A11","PAPERINO","SIGN","UNICT",22);
		Studente s1 = new Studente("A12","PLUTO","PLUTONE","UNIBO",34);
		
		lista.add(s);
		lista.add(s1);
		
	}

	public Studente addStudent(Studente s) {
		
		lista.add(s);
		
		return s;
	}

	public List<Studente> getAllStudents() {
		// TODO Auto-generated method stub
		return lista;
	}

	public Studente searchByMatr(String matricola) {
		for (Studente stud : lista) {
			if (matricola.equals(stud.getMatricola())) {
				return stud;
			}
		}
		return null;
	}

	
	public Studente update(Studente s) {
		int studCount = lista.size();
		for (int i = 0; i < studCount; i++) {
			Studente savedStud = lista.get(i);
			if (savedStud.getMatricola().equals(s.getMatricola())) {
				lista.set(i, s);
				return s;
			}
		}
		return s;
	}

}
