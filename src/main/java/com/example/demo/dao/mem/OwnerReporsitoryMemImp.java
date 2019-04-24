package com.example.demo.dao.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.OwnerReporsitory;
import com.example.demo.model.Owner;
@Repository
public class OwnerReporsitoryMemImp implements OwnerReporsitory {
	HashMap<Integer, Owner> map = new HashMap<>();
	public OwnerReporsitoryMemImp() {
		Owner o1 = new Owner();
		o1.setId(1);
		o1.setName("ali");
		o1.setYear("2000");
		Owner o2 = new Owner();
		o2.setId(2);
		o2.setName("ali2");
		o2.setYear("20002");
		Owner o3 = new Owner();
		o3.setId(3);
		o3.setName("ali3");
		o3.setYear("20003");
		Owner o4 = new Owner();
		o4.setId(4);
		o4.setName("ali4");
		o4.setYear("20004");
	map.put(o1.getId(), o1);
	map.put(o2.getId(), o2);
	map.put(o3.getId(), o3);
	map.put(o4.getId(), o4);
	
	}

	@Override
	public Owner findById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public List<Owner> findByName(String name) {
		// TODO Auto-generated method stub
		return map.values().stream().filter(o-> o.getName().equals(name)).collect(Collectors.toList());
	}

	@Override
	public List<Owner> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(map.values());
	}

	@Override
	public Owner create(Owner o) {
		return map.put(o.getId(), o);
		
	}

	@Override
	public void delete(int id) {
		map.remove(id);
		
	}

	@Override
	public Owner update(Owner o) {
		
		// TODO Auto-generated method stub
		return map.put(o.getId(), o);
	}

}
