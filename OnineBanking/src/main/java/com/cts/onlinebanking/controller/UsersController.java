package com.cts.onlinebanking.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.onlinebanking.model.Login;
import com.cts.onlinebanking.model.UserRegistration;
import com.cts.onlinebanking.repository.UserRegistrationRepository;
import com.cts.onlinebanking.service.AccountService;
import com.cts.onlinebanking.service.BalanceService;
import com.cts.onlinebanking.service.UserService;

@Controller
public class UsersController {
	
	
	UserRegistrationRepository uRepository;
	UserService service;
	AccountService accService;
	BalanceService balanceService;
	
	@Autowired
	public UsersController(UserRegistrationRepository uRepository, UserService service, AccountService accService,
			BalanceService balanceService) {
		this.uRepository = uRepository;
		this.service = service;
		this.accService = accService;
		this.balanceService = balanceService;
	}

	@GetMapping("/showMyLoginPage")
	public String welcomePage()
	{
		
		return "login";
	}
	
	@GetMapping("/register")
	public ModelAndView showRegisterPage(@ModelAttribute("user") UserRegistration user)
	{
		
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}
	
	@PostMapping("/register")
	public String registerPage(@Valid @ModelAttribute("user") UserRegistration user,BindingResult result )
	{

		if(result.hasErrors())
		{
			return "register";
		}
		service.createUser(user);
		accService.generateAccountNumber(user);
		return "redirect:/showMyLoginPage";
	}

	@GetMapping("/")
	public String showHome(Principal p,Model model)
	{
		String authority = service.getAuthority(p.getName());
		if(authority.contains("ADMIN"))
		{
			return "redirect:/admin/home";
		}
		UserRegistration userDetails=service.retriveUserDetails(p.getName());
		model.addAttribute("details", userDetails);
		model.addAttribute("savingBalance", balanceService.savingsBalance(p.getName()));
		model.addAttribute("currentBalance", balanceService.currentBalance(p.getName()));
		return "welcome";
	}
			
	@GetMapping("/access-denied")
	public String showError()
	{
		return "access-denied";
	}
}
