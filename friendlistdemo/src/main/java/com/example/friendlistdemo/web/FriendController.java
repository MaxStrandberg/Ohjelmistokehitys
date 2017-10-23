package com.example.friendlistdemo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.friendlistdemo.domain.Friends;




@Controller
public class FriendController {

	private List<Friends> friendlist;
	
	public FriendController() {
		friendlist = new ArrayList<Friends>();
	}
	
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("friends", new Friends());
        model.addAttribute("friendlist", friendlist);
        return "index";
    }
	
    @RequestMapping(value="/index", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Friends friends, Model model) {
        friendlist.add(friends);
        return "redirect:/index";
    }
}
