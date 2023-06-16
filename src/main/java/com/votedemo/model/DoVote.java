package com.votedemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "DoVote")
public class DoVote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doId")
	private Integer doId;
	
	@Column(name = "voter")
	private String voter;
	
	@Column(name = "voteNumber")
	private Integer voteNumber;
	
	@Column(name = "voteTime")
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss EEEE", timezone = "GMT+8")
	private Date voteTime;
	
	@PrePersist
	public void onCreate() {
		if(voteTime == null) {
			voteTime = new Date();
		}
	}
	
	
	public DoVote() {
	}


	public Integer getDoId() {
		return doId;
	}


	public void setDoId(Integer doId) {
		this.doId = doId;
	}


	public String getVoter() {
		return voter;
	}


	public void setVoter(String voter) {
		this.voter = voter;
	}


	public Integer getVoteNumber() {
		return voteNumber;
	}


	public void setVoteNumber(Integer voteNumber) {
		this.voteNumber = voteNumber;
	}


	public Date getVoteTime() {
		return voteTime;
	}


	public void setVoteTime(Date voteTime) {
		this.voteTime = voteTime;
	}


	
}
