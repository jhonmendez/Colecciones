package edu.cecar.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Universidad {
	
	public Universidad() {
	
		Estudiante estudiante = new Estudiante("91", "Angi", "Vergara", "I. Sistemas");
		Estudiante estudiante1 = new Estudiante("92", "Vicky", "Arraez", "I. Sistemas");
		Estudiante estudiante2 = new Estudiante("92", "Deicy", "Leon", "I. Industrial");
		Estudiante estudiante3 = new Estudiante("93", "Luis", "Moreno", "I. Industrial");
		
		Comparator<Estudiante> orderbyIdentificador = new Comparator<Estudiante>() {

			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				
				return o2.getIdentificacion().compareTo(o1.getIdentificacion());
				
			}
			
			
		};
		
		List<Estudiante> estudiantesList = new ArrayList<Estudiante>();
		Set<Estudiante> estudiantesSet = new TreeSet<Estudiante>(orderbyIdentificador);
		Map<String, Estudiante> estudiantesMap = new HashMap<String, Estudiante>();
		
		estudiantesList.add(estudiante);
		estudiantesList.add(estudiante1);
		estudiantesList.add(estudiante2);
		estudiantesList.add(estudiante3);
		
		
		estudiantesSet.add(estudiante);
		estudiantesSet.add(estudiante1);
		estudiantesSet.add(estudiante2);
		estudiantesSet.add(estudiante3);
		
		
		estudiantesMap.put("92", estudiante1);
		estudiantesMap.put("93", estudiante3);
		
		
		
		
		System.out.println("Elementos del List DesOrdenados por nombre");
		
		for (Estudiante estudianteItem : estudiantesList) {
		
			System.out.println(estudianteItem);
		}
		
		Collections.sort(estudiantesList);
		
		
		System.out.println("\n\nElementos del List Ordenados por nombre");
		
		for (Estudiante estudianteItem : estudiantesList) {
		
			System.out.println(estudianteItem);
		}
		
		System.out.println("\n\nElementos del List Ordenados por identificador");
		
		
		
		Collections.sort(estudiantesList,orderbyIdentificador);
		
		for (Estudiante estudianteItem : estudiantesList) {
			
			System.out.println(estudianteItem);
		}
		
		
		System.out.println("\n\nElementos del Set");
		
		estudiantesSet.forEach(e -> System.out.println(e));
		
		
		System.out.println("\n\n Elemento del Map");
		System.out.println(estudiantesMap.get("92"));
		
	}
	
	public static void main(String[] args) {
	
		new Universidad();
	}
	
}
