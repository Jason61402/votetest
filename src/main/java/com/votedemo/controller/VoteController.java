package com.votedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.votedemo.model.Vote;
import com.votedemo.service.VoteService;

@Controller
public class VoteController {
	
	@Autowired
	public VoteService voteService;
	
//  前往後台	
//	http://localhost:8042/my-app/vote/allVotes
	
	@GetMapping("/vote/add")
	public String addVote(Model model) {
		
		Vote newVo = new Vote();
		model.addAttribute("votes", newVo);
		
		
		return "backend/AddVote";
	}
	
	@PostMapping("/vote/post")
	public String addVote(@ModelAttribute Vote vote,Model model) {
		voteService.voteInsert(vote);
		
		Vote newVo = new Vote();
		model.addAttribute("votes", newVo);
		
		return "redirect:/vote/allVotes";
	}
	
	@GetMapping("/vote/allVotes")
	public String allVote(Model model) {
		List<Vote> allVote = voteService.findAllVote();
		model.addAttribute("allVotes",allVote);
		return "index";	
	}
	
	@GetMapping("/vote/edit")
	public String editVote(@RequestParam("vId")Integer id,Model model) {
		Vote vt1 = voteService.findByid(id);
		model.addAttribute("editVote", vt1);
		return "backend/EditVote";
	}
	
	@PostMapping("/vote/editpost")
	public String editVote(@ModelAttribute("editVote") Vote vote) {
		voteService.voteInsert(vote);
		return "redirect:/vote/allVotes";
	}
	
	@DeleteMapping("/vote/delete")
	public String voteDelete(@RequestParam("vId")Integer id) {
		voteService.deleteByid(id);
		return "redirect:/vote/allVotes";
	}
	
	
	


}
