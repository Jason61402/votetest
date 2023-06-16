package com.votedemo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votedemo.model.DoVote;
import com.votedemo.model.DoVoteRepository;

@Service
@Transactional
public class DovoteService {
	
	@Autowired
	private DoVoteRepository doVoteDao;
	
	public void insert(DoVote dovote) {
		doVoteDao.save(dovote);
	}
	
	public void count(String voteNumber) {
		doVoteDao.voteCount(voteNumber);
	}
	
	

}
