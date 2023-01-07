package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private Map<person, Gym> map=new HashMap<>();
	
	private List<person> personList=new ArrayList<>();
	
	
	
	
	

	
	

	
	public void printmap() {
		map.put(new person(1,"Name1", "Name1@gmail.com", 20, "7667291394"), new Gym(1,"cityZym1", 2000));
		map.put(new person(2,"Name2", "Name2@gmail.com", 20, "7667291394"), new Gym(2,"cityZym2", 2000));
		map.put(new person(3,"Nmae2", "Nmae3@gamil.com", 20, "7667291394"), new Gym(3,"cityZym3", 2000));
		

		for(Map.Entry<person, Gym> details:map.entrySet()) {
			System.out.println(details.getKey());
			System.out.println(details.getValue());
			System.out.println();
		
	}
		
	}
	
	public void printList() {
		person p1=new person(1,"Name1", "Name1@gmail.com", 20, "7667291394");
		person p2=new person(2,"Name2", "Name2@gmail.com", 20, "7667291394");
		person p3=new person(3,"Nmae3", "Nmae3@gamil.com", 20, "7667291394");
		person p4=new person(4,"Nmae4", "Nmae4@gamil.com", 20, "7667291394");
		person p5=new person(5,"Nmae5", "Nmae5@gamil.com", 20, "7667291394");
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		
		for(person p:personList) {
			System.out.println(p);
		}
	}
		
		

}
