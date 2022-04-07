package com.example.sb_oracle_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sb_oracle_demo.model.DummyUser;
import com.example.sb_oracle_demo.repository.DummyUserRepository;

@Service
public class DummyUserService {

	@Autowired
	private DummyUserRepository dummyUserRepository;

	public void init() {

		for (int i = 1; i <= 50; i++) {
			DummyUser dummyUser = new DummyUser();

			dummyUser.setName("사용자" + i);
			dummyUserRepository.save(dummyUser);
		}

	}

}
