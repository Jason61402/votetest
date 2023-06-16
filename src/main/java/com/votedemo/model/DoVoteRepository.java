package com.votedemo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DoVoteRepository extends JpaRepository<DoVote, Integer> {
	
		@Query(value = "SELECT COUNT(voteNumber) FROM DoVote WHERE voteNumber = :voteNumber ")
		public DoVote voteCount(String voteNumber);
		
		 
}
