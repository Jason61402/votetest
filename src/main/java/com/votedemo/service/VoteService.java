package com.votedemo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votedemo.model.Vote;
import com.votedemo.model.VoteRepository;

@Service
@Transactional
public class VoteService {
	
	@Autowired
	private VoteRepository voteDao;
	
	public void voteInsert(Vote vote) {
		voteDao.save(vote);
	}
	
	public Vote findByid(Integer id) {
		Optional<Vote> optional = voteDao.findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
			
		}
		return null;
	}
	
	public List<Vote> findAllVote(){
		return voteDao.findAll();
	}
	
	public void deleteByEntity(Vote vote) {
		voteDao.delete(vote);
	}
	
	public void deleteByid(Integer id) {
		voteDao.deleteById(id);
	}
	
	public Vote updateVoteByEntity(Vote newVote) {
		Optional<Vote> optional = voteDao.findById(newVote.getvId());
		
		if (optional.isPresent()) {
			Vote oldVote = optional.get();
			oldVote.setVoteNumber(newVote.getVoteNumber());
			oldVote.setVoteName(newVote.getVoteName());
			return voteDao.save(oldVote);
		}
		return null;
	}
	
	
	
	
	

}
