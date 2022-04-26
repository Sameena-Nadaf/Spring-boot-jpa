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

import com.cts.onlinebanking.model.Deposit;
import com.cts.onlinebanking.model.Withdraw;
import com.cts.onlinebanking.service.DepositService;
import com.cts.onlinebanking.service.WithdrawlService;

@Controller
public class TransactionController {
	
	DepositService dService;
	WithdrawlService wService;
	
	@Autowired
	public TransactionController(DepositService dService, WithdrawlService wService) {
		super();
		this.dService = dService;
		this.wService = wService;
	}

	
	@GetMapping("/deposit")
	public String showDeposit(@ModelAttribute("deposit") Deposit deposit,Principal principal)
	{
		return "deposit";
	}
	
	@PostMapping("/deposit")
	public String deposit(@ModelAttribute("deposit") Deposit deposit,Principal principal,Model model)
	{
		int isDeposited=dService.depositAmount(deposit, principal.getName());
		model.addAttribute("isDeposited", isDeposited);
		return "deposit";	
	}
	
	@GetMapping("/withdrawl")
	public String showWithdrawl(@ModelAttribute("withdrawl") Withdraw withdraw)
	{
		return "withdrawl";		
	}
	
	@PostMapping("/withdrawl")
	public String withDrawl(@ModelAttribute("withdrawl") Withdraw withdraw,Principal principal,Model model)
	{
		if(wService.set == 0)
		{
			model.addAttribute("message","Insufficient Balance");
			return "withdrawl";
		}else {
		int isWithdrawl=wService.withdrawlAmount(withdraw, principal.getName());
		model.addAttribute("message", "Successfully withdrawed");
		return "withdrawl";}
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
