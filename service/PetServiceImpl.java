package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PetDao;

import entity.Move;

@Service
@Transactional
public class PetServiceImpl implements PetService {
	@Autowired
	private PetDao petDao;

	public Move getMoveById(Integer moveId) {
		return petDao.getMoveById(moveId);
	}

}
