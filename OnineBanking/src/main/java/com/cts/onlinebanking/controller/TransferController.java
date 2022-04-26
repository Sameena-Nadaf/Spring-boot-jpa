package com.cts.onlinebanking.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.onlinebanking.model.SelfTransfer;
import com.cts.onlinebanking.model.TransferOthersAccount;
import com.cts.onlinebanking.service.OtherAccountTransferService;
import com.cts.onlinebanking.service.SelfTransferService;

@Controller
public class TransferController {
	
	SelfTransferService service;	
	OtherAccountTransferService otherService;
	
	@Autowired
	public TransferController(SelfTransferService service, OtherAccountTransferService otherService) {
		super();
		this.service = service;
		this.otherService = otherService;
	}


	@GetMapping("/toself")
	public String showSelfTransfer(@ModelAttribute("toself") SelfTransfer selfTransfer)
	{
		return "transfer";	
	}
	
	@PostMapping("/toself")
	public String selfTransfer(@ModelAttribute("toself") SelfTransfer selfTransfer,Principal principal,Model model)
	{
		int isSelfTransfer=service.selfTransfer(selfTransfer, principal.getName());
		model.addAttribute("isSelfTransfer", isSelfTransfer);
		return "transfer";	
	}
	
	@GetMapping("/toothers")
	public String showToOthersTransfer(@ModelAttribute("toothers") TransferOthersAccount othersTransfer)
	{
		return "toothers";
	}
	
	@PostMapping("/toothers")
	public String transferToOthers(@ModelAttribute("toothers") TransferOthersAccount othersTransfer,Principal principal,Model model)
	{
		int isToOthers=otherService.transferToOthers(othersTransfer, principal.getName());
		model.addAttribute("isToOthers", isToOthers);
		return "toothers";
	}
	
	@ModelAttribute("accType")
	public List<String> populateAccountType()
	{
		List<String> list = new ArrayList<>();
		list.add("Savings Account");
		list.add("Current Account");
		return list;
	}

}
