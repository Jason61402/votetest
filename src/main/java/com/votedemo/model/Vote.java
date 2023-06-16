package com.votedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vote")
public class Vote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vId")
	private Integer vId;
	
	@Column(name = "voteNumber")
	private Integer voteNumber;
	
	@Column(name = "voteName")
	private String voteName;
	
	public Vote() {
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public Integer getVoteNumber() {
		return voteNumber;
	}

	public void setVoteNumber(Integer voteNumber) {
		this.voteNumber = voteNumber;
	}

	public String getVoteName() {
		return voteName;
	}

	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}

	
	

}
