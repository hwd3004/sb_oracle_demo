package com.example.sb_oracle_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sb_oracle_demo.model.DummyNotice;
import com.example.sb_oracle_demo.repository.DummyNoticeRepository;

@Service
public class DummyNoticeService {

	@Autowired
	private DummyNoticeRepository dummyNoticeRepository;

	public void init() {

		for (int i = 1; i <= 50; i++) {
			DummyNotice dummyNotice = new DummyNotice();

			dummyNotice.setTitle("제목 " + i);
			dummyNoticeRepository.save(dummyNotice);
		}

	}

}
