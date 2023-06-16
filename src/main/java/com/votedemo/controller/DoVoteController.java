package com.votedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.votedemo.model.DoVote;
import com.votedemo.model.Vote;
import com.votedemo.service.DovoteService;
import com.votedemo.service.VoteService;

@Controller
public class DoVoteController {
	
	@Autowired
	public DovoteService dovoteService;
	
	@Autowired
	public VoteService voteService;

//  前往投票頁面
//	http://localhost:8042/my-app/vote/list
	@GetMapping("/vote/list")
	public String list(Model model) {
		List<Vote> list = voteService.findAllVote();
		model.addAttribute("list", list);
		return "fontend/DoVote";
	}
	
	@PostMapping("/vote/doVotepost")
	public String dovote(@ModelAttribute DoVote dovote) {
		dovoteService.insert(dovote);
		
		return "fontend/ThankYou";
		
	}
	
	@PostMapping("/vote/submit")
    public String submitForm(@RequestParam(name = "option", required = false) List<Integer> selectedOptions
    		,@RequestParam(name = "voter") String textInput) {
		if (selectedOptions != null && !selectedOptions.isEmpty()) {
            for (Integer option : selectedOptions) {
                DoVote myData = new DoVote();
                myData.setVoter(textInput);
                myData.setVoteNumber(option);
                dovoteService.insert(myData);
            }
        }
        return "fontend/ThankYou";
    }
	
	@GetMapping("/vote/thank")
	public String thank() {
		return "fontend/ThankYou";
	}
	
	
	@GetMapping("/vote/count")
	public String voteCount(@RequestParam String voteNumber) {
		 dovoteService.count(voteNumber);
		 
		 return "backend/voteCount";
	}
	
	
	
	
	
	
	
}
