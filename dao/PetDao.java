package dao;

import org.springframework.stereotype.Repository;

import entity.Move;
@Repository
public interface PetDao {
	
	public Move getMoveById(Integer moveId);

}
